
package com.kgh.music.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgh.music.entity.KMusicInfo;
import com.kgh.music.entity.Music;
import com.kgh.music.service.MusicService;
import com.kgh.user.entity.User;
import com.kgh.user.service.UserService;
/**
 *  用户  操作controller 
 * @author create by kgh
 *
 */
@RestController
@RequestMapping("/music")
public class MusicController{
	@Autowired
	MusicService musicService;
	
	@RequestMapping("/queryMusic")
	public List<Music> queryMusic(){
		List<Music> list = musicService.queryMusic();
		return list;
	}
	/**
	 * 查询歌曲上传页面 歌曲 状态待审核
	 * @param music
	 * @return
	 */
	@RequestMapping("/queryMusicInfo")
	public List<Music> queryMusicInfo(Music music){
		
		List<Music> list = musicService.queryMusicInfo(music);
		
		return list;
	}
	
	/**
	 * 歌曲管理页面 歌曲 状态审核通过。
	 * @param music
	 * @return
	 */
	@RequestMapping("/queryMusicPass")
	public List<Music> queryMusicPass(Music music){
		
		List<Music> list = musicService.queryMusicPass(music);
		
		return list;
	}
	
	
	/**
	 * 歌曲上传页面 新增
	 * @param music
	 * @return
	 */
	@RequestMapping("/insertMusic")
	public Map<String, String> insertMusic(KMusicInfo music){
		Map<String, String> result = new HashMap<String, String>();
		//查询上一个附件 id 
		String uploadId = musicService.getUploadId();
		music.setMusicAttachmentId(uploadId);
		music.setStatus(0);
		music.setMusicDownloadTimes(0);
		music.setMusicTimes(0);
		music.setCreateTime(new Date());
		try {
			musicService.insertMusic(music);
			result.put("result", "操作成功");
		} catch (Exception e) {
			// TODO: handle exception
			result.put("result", "error");
		}
		return result;
	}
}