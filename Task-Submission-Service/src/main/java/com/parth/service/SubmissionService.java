package com.parth.service;

import com.parth.model.Submission;

import java.util.List;

public interface SubmissionService {

    Submission submitTask(Long taskId, String  githubLink, Long userId,String jwt) throws Exception;

    Submission getTaskSubmissionById(Long submissionId)throws Exception;

    List<Submission> getAllTaskSubmission();

    List<Submission> getTaskSubmissionsByTaskId(Long taskId);

    Submission acceptDeclineSubmission(long id,String status)throws Exception;
}
