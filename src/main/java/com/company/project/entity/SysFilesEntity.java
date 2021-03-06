package com.company.project.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import com.company.project.vo.req.PageReqVO;


import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 文件上传
 *
 * @author manager
 * @email *****@mail.com
 * @date 2020-06-09 18:02:50
 */
@Data
@TableName("sys_files")
public class SysFilesEntity extends PageReqVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId("id")
	private String id;

	/**
	 * URL地址
	 */
	@TableField("url")
	private String url;

	/**
	 * 创建时间
	 */
	@TableField("create_date")
	private Date createDate;

	@TableField("file_name")
	private String fileName;

	@TableField("file_path")
	private String filePath;


}
