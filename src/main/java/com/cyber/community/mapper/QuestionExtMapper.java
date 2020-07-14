package com.cyber.community.mapper;

import com.cyber.community.model.Question;
import com.cyber.community.model.QuestionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface QuestionExtMapper {


    int incView(Question record);


}