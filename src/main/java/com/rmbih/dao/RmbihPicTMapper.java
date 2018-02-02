package com.rmbih.dao;

import com.rmbih.model.RmbihPicT;
import com.rmbih.model.RmbihPicTExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface RmbihPicTMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rmbih_pic_t
	 * @mbg.generated
	 */
	long countByExample(RmbihPicTExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rmbih_pic_t
	 * @mbg.generated
	 */
	int deleteByExample(RmbihPicTExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rmbih_pic_t
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rmbih_pic_t
	 * @mbg.generated
	 */
	int insert(RmbihPicT record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rmbih_pic_t
	 * @mbg.generated
	 */
	int insertSelective(RmbihPicT record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rmbih_pic_t
	 * @mbg.generated
	 */
	List<RmbihPicT> selectByExample(RmbihPicTExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rmbih_pic_t
	 * @mbg.generated
	 */
	RmbihPicT selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rmbih_pic_t
	 * @mbg.generated
	 */
	int updateByExampleSelective(@Param("record") RmbihPicT record, @Param("example") RmbihPicTExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rmbih_pic_t
	 * @mbg.generated
	 */
	int updateByExample(@Param("record") RmbihPicT record, @Param("example") RmbihPicTExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rmbih_pic_t
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(RmbihPicT record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rmbih_pic_t
	 * @mbg.generated
	 */
	int updateByPrimaryKey(RmbihPicT record);
	
	/** 获取图片和作者
	 *
	 * @return
	 */
	public List<Map<String, Object>> getPicListAndUser(@Param("UserID")Integer UserID);
}