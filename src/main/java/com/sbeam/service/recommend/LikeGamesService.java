package com.sbeam.service.recommend;

import com.sbeam.pojo.recommend.Games;

import java.util.List;

public interface LikeGamesService {
    //用户点击类型推荐
    public List<Games> getGamesByType(String type);

    //用户喜欢类型推荐
    public String likeTypes(int id);

    public List<Games> likeTypesGet(String[] s);
}
