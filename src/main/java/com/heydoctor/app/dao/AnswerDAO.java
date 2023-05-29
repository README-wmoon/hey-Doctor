package com.heydoctor.app.dao;

import com.heydoctor.app.domain.dto.AnswerDTO;
import com.heydoctor.app.domain.vo.AnswerVO;
import com.heydoctor.app.mapper.AnswerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class AnswerDAO {
    private final AnswerMapper answerMapper;

    public List<AnswerDTO> getAllAnswers(Long questionId) {
        return answerMapper.selectByQuestionId(questionId);
    }

    public void insert(AnswerVO answerVO) {
        answerMapper.insert(answerVO);
    }

    public Optional<AnswerDTO> select(Long answerId) {
        return Optional.ofNullable(answerMapper.select(answerId));
    }
    //    답변 왕 조회
    public List<AnswerVO> findByAdoptCount() {
        return answerMapper.selectByAdoptCount();
    }
}
