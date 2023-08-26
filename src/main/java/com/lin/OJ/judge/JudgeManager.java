package com.lin.OJ.judge;

import com.lin.OJ.judge.strategy.DefaultJudgeStrategy;
import com.lin.OJ.judge.strategy.JavaLanguageJudgeStrategy;
import com.lin.OJ.judge.strategy.JudgeContext;
import com.lin.OJ.judge.strategy.JudgeStrategy;
import com.lin.OJ.judge.codesandbox.model.JudgeInfo;
import com.lin.OJ.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
