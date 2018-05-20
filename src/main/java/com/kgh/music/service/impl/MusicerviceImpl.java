
package com.kgh.music.service.impl;

import java.util.List;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgh.music.entity.KMusicInfo;
import com.kgh.music.entity.Music;
import com.kgh.music.mapper.MusicMapper;
import com.kgh.music.service.MusicService;
@Service
public class MusicerviceImpl implements MusicService{
	@Autowired
	MusicMapper musicMapper;
	
	
	@Override
	public List<Music> queryMusic() {
		// TODO Auto-generated method stub
		return musicMapper.queryMusic();
	}


	@Override
	public String getUploadId() {
		// TODO Auto-generated method stub
		return musicMapper.getUploadId();
	}


	@Override
	public void insertMusic(KMusicInfo music) {
		// TODO Auto-generated method stub
		musicMapper.insert(music);
	}


	@Override
	public List<Music> queryMusicInfo(Music music) {
		
		if(music.getPag()==0){
			music.setPag(1);
		}else{
			music.setStart(music.getPag()*10-9);
		}
		
		music.setEnd(music.getPag()*10);
		return musicMapper.queryMusicInfo(music);
	}


	@Override
	public List<Music> queryMusicPass(Music music) {

		if(music.getPag()==0){
			music.setPag(1);
		}else{
			music.setStart(music.getPag()*10-9);
		}
		
		music.setEnd(music.getPag()*10);
		return musicMapper.queryMusicPass(music);
	}}