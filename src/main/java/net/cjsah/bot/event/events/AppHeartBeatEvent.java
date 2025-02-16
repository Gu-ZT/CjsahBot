package net.cjsah.bot.event.events;

import com.alibaba.fastjson2.JSONObject;
import lombok.Getter;
import net.cjsah.bot.data.StatusData;
import net.cjsah.bot.event.IEvent;
import net.cjsah.bot.util.JsonUtil;

@Getter
public class AppHeartBeatEvent implements IEvent {
    private final long interval;
    private final StatusData status;

    public AppHeartBeatEvent(JSONObject json) {
        this.interval = json.getLongValue("interval");
        this.status = JsonUtil.getObject(json, "status", StatusData.class);
    }

}
