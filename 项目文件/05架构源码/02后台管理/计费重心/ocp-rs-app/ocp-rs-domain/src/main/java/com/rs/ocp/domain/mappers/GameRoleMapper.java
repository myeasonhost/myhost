package com.rs.ocp.domain.mappers;

import com.rs.ocp.domain.endity.GameRole;
import com.rs.ocp.domain.endity.GameRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_role
     *
     * @mbggenerated
     */
    int countByExample(GameRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_role
     *
     * @mbggenerated
     */
    int deleteByExample(GameRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_role
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_role
     *
     * @mbggenerated
     */
    int insert(GameRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_role
     *
     * @mbggenerated
     */
    int insertSelective(GameRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_role
     *
     * @mbggenerated
     */
    List<GameRole> selectByExample(GameRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_role
     *
     * @mbggenerated
     */
    GameRole selectByPrimaryKey(Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_role
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") GameRole record, @Param("example") GameRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_role
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") GameRole record, @Param("example") GameRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GameRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GameRole record);
}