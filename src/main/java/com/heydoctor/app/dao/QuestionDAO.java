package com.heydoctor.app.dao;

import com.heydoctor.app.domain.dto.QuestionDTO;
import com.heydoctor.app.domain.vo.QuestionVO;
import com.heydoctor.app.mapper.QuestionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class QuestionDAO {
    private final QuestionMapper questionMapper;

    public List<QuestionVO> findAll(int page) {
        return questionMapper.selectList(page);
    }

    public Optional<QuestionDTO> findById(Long questionId) {
        return questionMapper.selectOne(questionId);
    }

    public void setQuestionVO(QuestionVO questionVO) {
        questionMapper.insert(questionVO);
    }
}
