
package com.kgh.music.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kgh.commonBaseDao.BaseMapper;
import com.kgh.music.entity.KMusicInfo;
import com.kgh.music.entity.Music;
import com.kgh.user.entity.User;

@Mapper
public interface MusicMapper extends BaseMapper<KMusicInfo> {
	/**
	 * 查询歌曲信息
	 */
	public List<Music> queryMusic();
	/**
	 * 查询上一个附件 id
	 */
	public String getUploadId();
	
	/**
	 * 查询歌曲状态为待审核 的 歌曲。
	 */
	public List<Music> queryMusicInfo(Music music);
	/**
	 * 审核 通过的 歌曲。
	 */
	public List<Music> queryMusicPass(Music music);
}