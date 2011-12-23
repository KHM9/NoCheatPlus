package cc.co.evenprime.bukkit.nocheat.data;

import java.util.Map;

/**
 * 
 */
public class ChatData extends Data {

    public int                    spamVL;
    public int                    spamTotalVL;
    public int                    spamFailed;
    public int                    emptyVL;
    public int                    emptyTotalVL;
    public int                    emptyFailed;

    public int                    messageCount = 0;
    public long                   spamLastTime = 0;
    public final ExecutionHistory history      = new ExecutionHistory();
    public String                 message      = "";

    @Override
    public void collectData(Map<String, Object> map) {
        map.put("chat.spam.vl", (int) spamTotalVL);
        map.put("chat.empty.vl", (int) emptyTotalVL);
        map.put("chat.spam.failed", spamFailed);
        map.put("chat.empty.failed", emptyFailed);
    }
}
