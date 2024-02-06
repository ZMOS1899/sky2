package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    List<Long> getSetmealByDishIds(List<Long> dishIds);

    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
}
