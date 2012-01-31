package cc.co.evenprime.bukkit.nocheat.config;

/**
 * Paths for the configuration options
 * 
 */
public abstract class ConfPaths {

    private final static String LOGGING                                   = "logging.";
    public final static String  LOGGING_ACTIVE                            = LOGGING + "active";
    public final static String  LOGGING_PREFIX                            = LOGGING + "prefix";
    public final static String  LOGGING_FILENAME                          = LOGGING + "filename";
    public final static String  LOGGING_LOGTOFILE                         = LOGGING + "file";
    public final static String  LOGGING_LOGTOCONSOLE                      = LOGGING + "console";
    public final static String  LOGGING_LOGTOINGAMECHAT                   = LOGGING + "ingamechat";
    public final static String  LOGGING_SHOWACTIVECHECKS                  = LOGGING + "showactivechecks";

    private final static String CHECKS                                    = "checks.";
    private final static String INVENTORY_DROP                            = CHECKS + "inventory.drop.";
    public final static String  INVENTORY_DROP_CHECK                      = INVENTORY_DROP + "active";
    public final static String  INVENTORY_DROP_TIMEFRAME                  = INVENTORY_DROP + "time";
    public final static String  INVENTORY_DROP_LIMIT                      = INVENTORY_DROP + "limit";
    public final static String  INVENTORY_DROP_ACTIONS                    = INVENTORY_DROP + "actions";

    private final static String MOVING                                    = CHECKS + "moving.";

    private final static String MOVING_RUNFLY                             = MOVING + "runfly.";
    public final static String  MOVING_RUNFLY_CHECK                       = MOVING_RUNFLY + "active";
    public final static String  MOVING_RUNFLY_ALLOWFASTSNEAKING           = MOVING_RUNFLY + "allowfastsneaking";
    public final static String  MOVING_RUNFLY_ACTIONS                     = MOVING_RUNFLY + "actions";

    public final static String  MOVING_RUNFLY_CHECKNOFALL                 = MOVING_RUNFLY + "checknofall";
    public final static String  MOVING_RUNFLY_NOFALLACTIONS               = MOVING_RUNFLY + "nofallactions";

    private final static String MOVING_RUNFLY_FLYING                      = MOVING_RUNFLY + "flying.";
    public final static String  MOVING_RUNFLY_FLYING_ALLOWALWAYS          = MOVING_RUNFLY_FLYING + "allowflyingalways";
    public final static String  MOVING_RUNFLY_FLYING_ALLOWINCREATIVE      = MOVING_RUNFLY_FLYING + "allowflyingincreative";
    public final static String  MOVING_RUNFLY_FLYING_SPEEDLIMITVERTICAL   = MOVING_RUNFLY_FLYING + "flyingspeedlimitvertical";
    public final static String  MOVING_RUNFLY_FLYING_SPEEDLIMITHORIZONTAL = MOVING_RUNFLY_FLYING + "flyingspeedlimithorizontal";
    public final static String  MOVING_RUNFLY_FLYING_HEIGHTLIMIT          = MOVING_RUNFLY_FLYING + "flyingheightlimit";
    public final static String  MOVING_RUNFLY_FLYING_ACTIONS              = MOVING_RUNFLY_FLYING + "actions";

    private final static String MOVING_MOREPACKETS                        = MOVING + "morepackets.";
    public final static String  MOVING_MOREPACKETS_CHECK                  = MOVING_MOREPACKETS + "active";
    public final static String  MOVING_MOREPACKETS_ACTIONS                = MOVING_MOREPACKETS + "actions";

    private final static String BLOCKBREAK                                = CHECKS + "blockbreak.";

    private final static String BLOCKBREAK_REACH                          = BLOCKBREAK + "reach.";
    public final static String  BLOCKBREAK_REACH_CHECK                    = BLOCKBREAK_REACH + "active";
    public final static String  BLOCKBREAK_REACH_ACTIONS                  = BLOCKBREAK_REACH + "actions";

    private final static String BLOCKBREAK_DIRECTION                      = BLOCKBREAK + "direction.";
    public final static String  BLOCKBREAK_DIRECTION_CHECK                = BLOCKBREAK_DIRECTION + "active";
    public final static String  BLOCKBREAK_DIRECTION_PRECISION            = BLOCKBREAK_DIRECTION + "precision";
    public final static String  BLOCKBREAK_DIRECTION_PENALTYTIME          = BLOCKBREAK_DIRECTION + "penaltytime";
    public final static String  BLOCKBREAK_DIRECTION_ACTIONS              = BLOCKBREAK_DIRECTION + "actions";

    private final static String BLOCKBREAK_NOSWING                        = BLOCKBREAK + "noswing.";
    public static final String  BLOCKBREAK_NOSWING_CHECK                  = BLOCKBREAK_NOSWING + "active";
    public static final String  BLOCKBREAK_NOSWING_ACTIONS                = BLOCKBREAK_NOSWING + "actions";

    private final static String BLOCKPLACE                                = CHECKS + "blockplace.";

    private final static String BLOCKPLACE_REACH                          = BLOCKPLACE + "reach.";
    public final static String  BLOCKPLACE_REACH_CHECK                    = BLOCKPLACE_REACH + "active";
    public final static String  BLOCKPLACE_REACH_ACTIONS                  = BLOCKPLACE_REACH + "actions";

    private final static String BLOCKPLACE_DIRECTION                      = BLOCKPLACE + "direction.";
    public final static String  BLOCKPLACE_DIRECTION_CHECK                = BLOCKPLACE_DIRECTION + "active";
    public final static String  BLOCKPLACE_DIRECTION_PRECISION            = BLOCKPLACE_DIRECTION + "precision";
    public final static String  BLOCKPLACE_DIRECTION_PENALTYTIME          = BLOCKPLACE_DIRECTION + "penaltytime";
    public final static String  BLOCKPLACE_DIRECTION_ACTIONS              = BLOCKPLACE_DIRECTION + "actions";

    private final static String CHAT                                      = CHECKS + "chat.";

    private final static String CHAT_COLOR                                = CHAT + "color.";
    public final static String  CHAT_COLOR_CHECK                          = CHAT_COLOR + "active";
    public final static String  CHAT_COLOR_ACTIONS                        = CHAT_COLOR + "actions";

    private final static String CHAT_SPAM                                 = CHAT + "spam.";
    public final static String  CHAT_SPAM_CHECK                           = CHAT_SPAM + "active";
    public final static String  CHAT_SPAM_WHITELIST                       = CHAT_SPAM + "whitelist";
    public final static String  CHAT_SPAM_TIMEFRAME                       = CHAT_SPAM + "timeframe";
    public final static String  CHAT_SPAM_LIMIT                           = CHAT_SPAM + "messagelimit";
    public final static String  CHAT_SPAM_COMMANDLIMIT                    = CHAT_SPAM + "commandlimit";
    public final static String  CHAT_SPAM_ACTIONS                         = CHAT_SPAM + "actions";

    private final static String FIGHT                                     = CHECKS + "fight.";

    private final static String FIGHT_DIRECTION                           = FIGHT + "direction.";
    public final static String  FIGHT_DIRECTION_CHECK                     = FIGHT_DIRECTION + "active";
    public final static String  FIGHT_DIRECTION_PRECISION                 = FIGHT_DIRECTION + "precision";
    public final static String  FIGHT_DIRECTION_PENALTYTIME               = FIGHT_DIRECTION + "penaltytime";
    public final static String  FIGHT_DIRECTION_ACTIONS                   = FIGHT_DIRECTION + "actions";

    private final static String FIGHT_NOSWING                             = FIGHT + "noswing.";
    public final static String  FIGHT_NOSWING_CHECK                       = FIGHT_NOSWING + "active";
    public final static String  FIGHT_NOSWING_ACTIONS                     = FIGHT_NOSWING + "actions";

    private final static String FIGHT_REACH                               = FIGHT + "reach.";
    public static final String  FIGHT_REACH_CHECK                         = FIGHT_REACH + "active";
    public static final String  FIGHT_REACH_LIMIT                         = FIGHT_REACH + "distance";
    public static final String  FIGHT_REACH_PENALTYTIME                   = FIGHT_REACH + "penaltytime";
    public static final String  FIGHT_REACH_ACTIONS                       = FIGHT_REACH + "actions";

    private final static String FIGHT_SPEED                               = FIGHT + "speed.";
    public final static String  FIGHT_SPEED_CHECK                         = FIGHT_SPEED + "active";
    public final static String  FIGHT_SPEED_ATTACKLIMIT                   = FIGHT_SPEED + "attacklimit";
    public final static String  FIGHT_SPEED_ACTIONS                       = FIGHT_SPEED + "actions";

    public final static String  STRINGS                                   = "strings";

}
