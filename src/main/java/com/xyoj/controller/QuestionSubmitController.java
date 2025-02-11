//package com.xyoj.controller;
//
//import com.xyoj.common.BaseResponse;
//import com.xyoj.common.ErrorCode;
//import com.xyoj.common.ResultUtils;
//import com.xyoj.exception.BusinessException;
//import com.xyoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
//import com.xyoj.model.entity.User;
//import com.xyoj.service.QuestionSubmitService;
//import com.xyoj.service.UserService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//
///**
// * 题目提交接口
// *
// * @author xuyuan
// *
// */
//@RestController
//@RequestMapping("/question_submit")
//@Slf4j
//public class QuestionSubmitController {
//
//    @Resource
//    private QuestionSubmitService questionSubmitService;
//
//    @Resource
//    private UserService userService;
//
//    /**
//     * 提交代码 / 取消提交代码
//     *
//     * @param questionSubmitAddRequest
//     * @param request
//     * @return resultNum 本次提交代码变化数
//     */
//    @PostMapping("/")
//    public BaseResponse<Long> doQuestionSubmit(@RequestBody QuestionSubmitAddRequest questionSubmitAddRequest,
//                                         HttpServletRequest request) {
//        if (questionSubmitAddRequest == null || questionSubmitAddRequest.getQuestionId() <= 0) {
//            throw new BusinessException(ErrorCode.PARAMS_ERROR);
//        }
//        // 登录才能提交代码
//        final User loginUser = userService.getLoginUser(request);
//        long questionId = questionSubmitAddRequest.getQuestionId();
//        long result = questionSubmitService.doQuestionSubmit(questionSubmitAddRequest, loginUser);
//        return ResultUtils.success(result);
//    }
//
//}
