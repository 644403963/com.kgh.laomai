
package com.kgh.music.service;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.kgh.music.entity.KMusicInfo;
import com.kgh.music.entity.Music;
import com.kgh.user.entity.User;

public interface MusicService{
	
	/**
	 * 用户注册
	 */
	public List<Music> queryMusic();
	/**
	 * 查询上一个附件 id
	 */
	public String getUploadId();
	/**
	 * 保存 音乐信息
	 * 
	 */
	public void insertMusic(KMusicInfo music);
	/**
	 * 查询歌曲状态为待审核 的 歌曲。
	 */
	public List<Music> queryMusicInfo(Music music);
	/**
	 * 审核 通过的 歌曲。
	 */
	public List<Music> queryMusicPass(Music music);
}