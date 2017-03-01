package com.dituibaobao.dao.mapper;

import com.dituibaobao.dao.model.ChannelTask;
import com.dituibaobao.dao.model.ChannelTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChannelTaskMapper {
    int countByExample(ChannelTaskExample example);

    int deleteByExample(ChannelTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChannelTask record);

    int insertSelective(ChannelTask record);

    List<ChannelTask> selectByExample(ChannelTaskExample example);

    ChannelTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChannelTask record, @Param("example") ChannelTaskExample example);

    int updateByExample(@Param("record") ChannelTask record, @Param("example") ChannelTaskExample example);

    int updateByPrimaryKeySelective(ChannelTask record);

    int updateByPrimaryKey(ChannelTask record);
}