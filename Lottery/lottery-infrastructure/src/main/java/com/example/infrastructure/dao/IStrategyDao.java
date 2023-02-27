package com.example.infrastructure.dao;

import com.example.infrastructure.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description: Lottery
 * Creator: levin
 * Date: 2/26/2023
 * Time: 11:42 PM
 * Email: levinforward@163.com
 */
@Mapper
public interface IStrategyDao {

    Strategy queryStrategy(Long strategyId);
}