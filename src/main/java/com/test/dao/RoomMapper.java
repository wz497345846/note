package com.test.dao;

import com.test.pojo.Room;
import com.test.pojo.RoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RoomMapper {
    int deleteByExample(RoomExample example);

    int insert(Room record);

    int insertSelective(Room record);

    List<Room> selectByExampleWithRowbounds(RoomExample example, RowBounds rowBounds);

    List<Room> selectByExample(RoomExample example);

    int updateByExampleSelective(@Param("record") Room record, @Param("example") RoomExample example);

    int updateByExample(@Param("record") Room record, @Param("example") RoomExample example);
}