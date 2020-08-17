package com.pz.crowd.api;

import com.pz.crowd.entity.vo.DetailProjectVO;
import com.pz.crowd.util.ResultEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.TimeUnit;

@Component
@FeignClient(value = "pz-crowd-redis")
public interface CrowdRedisRemoteService {
    @RequestMapping("/provider/key/exists/bitmap")
    public ResultEntity<Boolean> keyExists(
            @RequestParam("indexsJSON") String indexsJSON,
            @RequestParam("BIT_MAP_KEY")String BIT_MAP_KEY
    );

    @RequestMapping("/provider/put/to/bitmap")
    public ResultEntity putToBitMap(@RequestParam("indexsJSON")String indexsJSON,@RequestParam("BIT_MAP_KEY")String BIT_MAP_KEY);

    @RequestMapping("/privider/create/bitmap")
    public ResultEntity createBitMap(
            @RequestParam("BIT_MAP_KEY") String BIT_MAP_KEY,
            @RequestParam("maxBitNum") Long maxBitNum,
            @RequestParam("lastBitStatus") Boolean lastBitStatus
    );
    @RequestMapping("/provider/exists/bitmap")
    public ResultEntity<Boolean> existsBitMap(@RequestParam("BIT_MAP_KEY")String BIT_MAP_KEY);

    @RequestMapping("/provider/get/detailProjectVO/remote")
    public ResultEntity<DetailProjectVO> getDetailProjectVORemote(@RequestParam("projectId")Long projectId);

    @RequestMapping("/provider/set/string/kv/remote")
    public ResultEntity<String> setStringKeyValueRemote(
            @RequestParam("key")String key,
            @RequestParam("value")String value
    );

    @RequestMapping("/provider/set/string/kv/with/timeout/remote")
    public ResultEntity<String> setStringKeyValueWithTimeoutRemote(
            @RequestParam("key")String key,
            @RequestParam("value")String value,
            @RequestParam("time")long time,
            @RequestParam("timeUnit")TimeUnit timeUnit
    );

    @RequestMapping("/provider/get/string/by/key/remote")
    public ResultEntity<String> getStringValueByKeyRemote(@RequestParam("key")String key);

    @RequestMapping("/provider/remove/key/remote")
    public ResultEntity<String> removeKeyRemote(@RequestParam("key")String key);

}
