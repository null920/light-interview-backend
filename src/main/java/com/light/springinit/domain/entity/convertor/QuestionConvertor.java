package com.light.springinit.domain.entity.convertor;


import com.light.springinit.domain.entity.Question;
import com.light.springinit.domain.vo.QuestionVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 转换器
 *
 * @author null&&
 * @Date 2024/12/20 16:41
 */
@Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface QuestionConvertor {
    QuestionConvertor INSTANCE = Mappers.getMapper(QuestionConvertor.class);

    /**
     * 转换为vo
     *
     * @param request
     * @return
     */
    @Mapping(target = "id", source = "request.id")
    public QuestionVO mapToVo(Question request);

    /**
     * 转换为实体
     *
     * @param request
     * @return
     */
    @Mapping(target = "id", source = "request.id")
    public Question mapToEntity(QuestionVO request);

    /**
     * list转换为vo
     *
     * @param request
     * @return
     */
    public List<QuestionVO> mapToVo(List<Question> request);
}
