package net.cjsah.bot.data.notice;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import net.cjsah.bot.data.BaseData;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class GroupMsgRecall extends BaseData {
    private long userId;
    private long groupId;
    private long operateId;
    private long messageId;
}
