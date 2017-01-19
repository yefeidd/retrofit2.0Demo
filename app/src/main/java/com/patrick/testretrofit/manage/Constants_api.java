package com.patrick.testretrofit.manage;

/**
 * Created by WJL on 2016/3/10 0010 10:20.
 */
public class Constants_api {

    //    public final static String BASE_URL = "http://192.168.1.161:98";// 内网

    // --------------- 证 牛 ------------------
//    public final static String BASE_URL = "http://www.zhengniu.net";// 证牛正式网
//    public final static String BASE_URL = "https://tt.zhengniu.net";// 证牛测试网
//    public final static String BASE_URL = "http://fz.zhengniu.net";// 证牛测试网
    public final static String BASE_URL = "http://tt.zhengniu.net";// 证牛测试网
//    public final static String BASE_URL = "https://www.joekoe.com";// 证牛测试网

    // ---------------98财富网------------------
//        public final static String BASE_URL = "http://tt.98cfw.com";// 98财富网测试网
//        public final static String BASE_URL = "http://www.98cfw.com";// 98财富网真实环境


    public final static String LOGIN_URL = "Api/User/login";//登录
    public final static String SEND_REGIST_CODE = "Api/User/sds6mg_jazf";//注册发验证码
    public final static String SEND_SMS_FIND_PW = "Api/User/sdl5d_szdfg";//找回密码发验证码
    public final static String FIND_PW = "Api/User/zpass";//找回密码
    public final static String MODIFY_PW = "Api/Member/spass";//修改密码
    public final static String SEND_REGISTER_INFO = "Api/User/registered";//发送注册信息
    public final static String GET_MEMBER_INFO = "Api/Member/meminfo";//获取会员信息
    public final static String MODIFY_MEMBER_INFO = "Api/Member/uinfo";//修改会员信息
    public final static String UPLOAD_TOKEN = "Api/Upload/token";// 获取七牛token
    public final static String SEND_IM_MSG = "Api/Im/send";// 向服务器发送消息内容
    public final static String LOAD_BANER_INFO = "Api/System/getbanner";// 获取广告内容
    public final static String GET_HOT_LIVE_INFO = "Api/Room/index";// 获取热门直播列表
    public final static String EXIT_LOGIN = "Api/Member/out";// 退出登陆
    public final static String GET_PRIVATE_MSG = "Api/Room/getpmsg";// 获取特约讲堂悄悄话列表
    public final static String GET_USER_PRIVATE_MSG = "Api/Member/getmemqa";// 获取个人悄悄话列表
    public final static String GET_VIP_STATE = "Api/Room/isroomvip";// 获取vip状态
    public final static String CHAT_LIST = "Api/Index/im";// 获取聊天的html界面
    public final static String VIDEO_LIST = "Api/Video/video_list";// 获取视频列表
    public final static String CONTRIBUTION = "Api/Room/getcontribution";// 获取贡献榜
    public final static String VIP_MEMBER_INSTRU = "Api/Member/vippre";// VIP会员介绍
    public final static String GET_COURSE = "Api/Room/getkcb";// 获取课程表
    public final static String GET_NOTICE = "Api/Room/getplacard";// 获取特约讲堂公告

    public final static String ARTICLE = "Api/Room/getart";// 获取博文列表

    public final static String GET_COLLECT_LIST = "Api/Member/user_collect_list";// 会员收藏列表(文章，视频)
    public final static String ADD_VIDEO_COLLECT = "Api/Member/add_video_collect";// 增加视频收藏
    public final static String GET_COLLECT_ROOM_LIST = "Api/Member/user_collect_room";// 会员关注列表(房间)
    public final static String CANCEL_ROOM = "Api/Member/user_cancel_room";// 会员删除关注(房间)
    public final static String TACTICS_LIST = "Api/Member/user_tactics";// 会员购买策略列表

    public final static String ART_CLICK = "Api/Room/add_art_click";// 增加点击量
    public final static String ART_LIKES = "Api/Room/add_art_likes";// 增加文章点赞量
    public final static String ART_COLLECT = "Api/Member/add_art_collect";// 增加文章收藏量
    public final static String IS_COLLECT_ART = "Api/Member/is_collect_art";// 文章是否被收藏过
    public final static String SEND_PRIVATE_MSG = "Api/Member/sendqqh";// 发送悄悄话

    public final static String IS_COLLECT_ROOM = "Api/Member/is_collect_room"; // 房间是否被关注过
    public final static String ADD_ROOM_COLLECT = "Api/Member/add_room_collect"; // 增加房间收藏量
    public final static String BUY_TACTICS = "Api/Member/bug_tac"; // 购买策略

    public final static String ADD_RECHARGE_ORDER = "Api/Member/add_recharge"; // 生成充值订单
    //    public final static String TEACHER_TACTICS = "Api/Room/tactics"; // 老师房间策略列表
    public final static String TEACHER_ROOM_SUMMARY = "Api/Room/roomsummary"; // 获取房间简介
    public final static String ROOM_TACTICS = "Api/Room/tactics"; // 老师房间策略列表
    public final static String ROOM_VIP_PAGE = "Api/Room/gettvippage"; // 获取老师VIP会员介绍页面地址
    public final static String ROOM_ARICLE = "Api/Room/get_mjbw"; // 获取老师博文页面
    public final static String REGISTER_MEMRA = "Api/index/memra"; // 注册协议
    public final static String STOCK_SCHOOL = "Api/Stockmc/index"; // 股市学院
    public final static String FEED_BACK = "Api/Member/feedback"; // 意见反馈

    public final static String ANDREWS_VER = "Api/Index/andrews_ver"; // 自动更新的接口
    public final static String QQ_SL = "Api/Room/getqqbytid"; // 获取特约讲堂QQ号

    public final static String IM_DARA = "Api/Index/get_im_data"; // 获取房间历史聊天记录

    public final static String TRIPARTITE_LOGIN = "Api/User/tripartite_login";//第三方登陆的接口
    public final static String TRIPARTITE_BINDING = "Api/User/tripartite_binding";//第三方登陆绑定的接口
    public final static String TRIPARTITE_REG = "Api/User/tripartite_reg";//第三方登陆注册的接口


    public final static String QQ_URL = "mqqwpa://im/chat?chat_type=wpa&uin=";//跳转qq的action

    //------------------------- 行情接口---------------------------------
    public final static String SH_INDEX = "Api/Quotation/shindex"; // 获取上证指数
    public final static String SZ_INDEX = "Api/Quotation/szindex"; // 获取深圳成指
    public final static String CY_INDEX = "Api/Quotation/cybindex"; // 获取创业板指
    public final static String HS_INDEX = "Api/Quotation/hsindex"; // 获取恒生板指
    public final static String GQ_INDEX = "Api/Quotation/gqindex"; // 获取国企板指
    public final static String HC_INDEX = "Api/Quotation/hcindex"; // 获取红绸板指

    public final static String ADD_SELF_STOCK = "Api/Optionalg/add"; // 用户添加自选股票
    public final static String QUERY_SELF_STOCK = "Api/Optionalg/index"; // 拉取用户自选股票列表
    public final static String DEL_SELF_STOCK = "Api/Optionalg/delug"; // 用户删除自选股票
    public final static String ADD_SELF_STOCK_JSON = "Api/Optionalg/utbzxg"; // 用户同步自选股到服务器

    public final static String QUERY_SS = "Api/Tcfw/index"; // 沪深首页
    public final static String QUERY_ZFB_LIST = "Api/Tcfw/zfb_list"; // 涨幅榜列表
    public final static String QUERY_DFB_LIST = "Api/Tcfw/dfb_list"; // 跌幅榜列表
    public final static String QUERY_HSL_LIST = "Api/Tcfw/hsl_list"; // 换手率列表
    public final static String QUERY_ZF_LIST = "Api/Tcfw/zhenfu_list"; // 振幅榜列表
    public final static String QUERY_GJB_LIST = "Api/Tcfw/tic_,price_list"; // 高价榜列表

    public final static String QUERY_HOT_HY = "Api/History/get_hot_hy"; // 热门行业列表
    public final static String QUERY_HOT_HY_LIST = "Api/History/get_hot_hylist"; // 某个热门行业下的股票列表
    public final static String QUERY_HOT_GN = "Api/History/get_hot_gn"; // 热门概念列表
    public final static String QUERY_HOT_GN_LIST = "Api/History/get_hot_gnlist"; // 某个热门概念下的股票列表

    public final static String QUERY_TIC_INFO = "Api/Tcfw/get_tic_info"; // 沪深股票股东，简况，财务信息
    public final static String QUERY_HK_TIC_INFO = "Api/Tcfw/get_hk_tic_info"; // 港股股东，简况信息

    public final static String GET_MIN_QUOTA = "Api/Tcfw/get_min_quota"; // 沪深分时图数据
    public final static String HS_DAY_QUOTA = "Api/Tcfw/hs_day_quota"; // 沪深日K线图数据
    public final static String HS_WEEK_QUOTA = "Api/Tcfw/hs_week_quota"; // 沪深周K线图数据
    public final static String HS_MONTH_QUOTA = "Api/Tcfw/hs_month_quota"; // 沪深月K线图数据

    public final static String GG_DAY_K = "Api/Hk/gg_day_k";//港股日K
    public final static String GET_WEEK_K = "Api/Hk/get_week_k";//港股周K
    public final static String GET_YUE_K = "Api/Hk/get_yue_k";//港股月K


    public final static String GET_MIN_ZS_QUOTA = "Api/Tcfw/get_min_zs_quota";//指数分时
    public final static String GET_SZ_DAY_K = "Api/Tcfw/get_sz_day_k";//上证日K
    public final static String GE_SZ_WEEK_K = "Api/Tcfw/ge_sz_week_k";//上证周K
    public final static String GET_SZ_YUE_K = "Api/Tcfw/get_sz_yue_k";//上证月K
    public final static String GET_CZ_DAY_K = "Api/Tcfw/get_cz_day_k";//深圳成指日K
    public final static String GE_SZCZ_WEEK_K = "Api/Tcfw/ge_szcz_week_k";//深圳成指周K
    public final static String GET_SZCZ_YUE_K = "Api/Tcfw/get_szcz_yue_k";//深圳成指月K
    public final static String GET_CY_DAY_K = "Api/Tcfw/get_cy_day_k";//创业板指日K
    public final static String GE_CY_WEEK_K = "Api/Tcfw/ge_cy_week_k";//创业板指周K
    public final static String GET_CY_YUE_K = "Api/Tcfw/get_cy_yue_k";//创业板指月K
    public final static String GET_HS_DAY_K = "Api/Hk/get_hs_day_k";//恒生指数日K
    public final static String GE_HS_WEEK_K = "Api/Hk/ge_hs_week_k";//恒生指数周K
    public final static String GET_HS_YUE_K = "Api/Hk/get_hs_yue_k";//恒生指数月K
    public final static String GET_GQ_DAY_K = "Api/Hk/get_gq_day_k";//国企指数日K
    public final static String GE_GQ_WEEK_K = "Api/Hk/ge_gq_week_k";//国企指数周K
    public final static String GET_GQ_YUE_K = "Api/Hk/get_gq_yue_k";//国企指数月K
    public final static String GET_HC_DAY_K = "Api/Hk/get_hc_day_k";//红筹指数日K
    public final static String GE_HC_WEEK_K = "Api/Hk/ge_hc_week_k";//红筹指数周K
    public final static String GET_HC_YUE_K = "Api/Hk/get_hc_yue_k";//红筹指数月K


    public final static String QUERY_HK = "Api/Hk/index"; // 港股首页
    public final static String QUERY_MAIN_UPDOWN = "Api/Hk/main_updown_list"; // 港股主板涨跌幅|
    public final static String QUERY_MAIN_MONEY = "Api/Hk/main_money_list"; // 港股主板成交额
    public final static String QUERY_NEW_UPDOWN = "Api/Hk/new_updown_list"; // 港股创业板涨跌幅
    public final static String QUERY_NEW_MONEY = "Api/Hk/new_money_list"; // 港股创业板成交额

    public final static String QUERY_SH_DETAIL = "Api/Quotation/shdetail"; // 上证指数详情数据
    public final static String QUERY_SZ_DETAIL = "Api/Quotation/szdetail"; // 深圳成指，创业板指详情数据

    public final static String QUERY_HK_UPDOWN_HS = "Api/Hk/hs_updown_list"; // 恒生指数成份股
    public final static String QUERY_HK_UPDOWN_GQ = "Api/Hk/gq_updown_list"; // 国企指数成份股
    public final static String QUERY_HK_UPDOWN_HC = "Api/Hk/hc_updown_list"; // 红筹指数成份股

    public final static String QUERY_SH_CFG = "Api/Tcfw/get_index_list"; // 上证指数、深圳成指、创业板指成份股

    public final static String QUERY_HK_HS_DETAIL = "Api/Hk/hensheng"; // 恒生指数详情数据
    public final static String QUERY_HK_GQ_DETAIL = "Api/Hk/guoqi"; // 国企指数详情数据
    public final static String QUERY_HK_HC_DETAIL = "Api/Hk/hongchou"; // 红筹指数详情数据
    public final static String TIC_TOP_INFO = "Api/Tcfw/tic_top_info";//股票详情数据

    public final static String HK_NEWS_LIST = "Api/New/gg_new_list";//港股新闻公告列表
    public final static String HS_NEWS_LIST = "Api/New/hs_new_list";//沪深新闻公告列表

    public final static String SEARCH_STOCK = "Api/Search/index";//查询股票

    public final static String BUY_SELL_STOCK = "Api/analog/trade_stock";// 买入卖出股票
    public final static String QUERY_USER_POSITION = "Api/Virtual/get_user_position";// 模拟炒股用户资产页面中持股列表
    public final static String TRADE_STOCK = "Api/analog/do_trade_stock";// 提交买卖股票
    public final static String QUERY_HOLD = "Api/analog/hold_code"; // 成交明细--当前持仓
    public final static String QUERY_HOLD_LIST = "Api/analog/hold_code_list"; // 持仓列表页
    public final static String QUERY_IMITATE_FRY = "Api/Virtual/index"; // 模拟炒股用户首页
    public final static String QUERY_RECORD_LIST = "Api/analog/code_trade_list"; // 历史交易--历史成交
    public final static String QUERY_CHANGE_LIST = "Api/analog/change_list"; // 历史交易--成交明细 头部接口
    public final static String QUERY_CHANGE_CODE_LIST = "Api/analog/change_code_list"; // 历史交易--成交明细 列表接口
    public final static String QUERY_TA_HOME_MSG = "Api/Virtualmatch/user_head_info"; // 他人的主页
    public final static String QUERY_TA_HISTORY = "Api/Virtualmatch/trade_list"; // 他人主页交易记录
    public final static String ATTENTION_OTHER = "Api/analog/user_add_concern"; // 关注他人
    public final static String QUERY_CONTEST_HOME_LIST = "Api/Virtualmatch"; //模拟大赛首页
    public final static String QUERY_FY_RANKING = "Api/Virtualmatch/fy_ranking"; //风雨排行榜详情页
    public final static String QUERY_TRACK_RANKING = "Api/Virtualmatch/track_ranking"; //风雨排行榜详情页
    public final static String QUERY_HOT_TIC = "Api/Virtualmatch/hot_tic"; //风雨排行榜详情页

    public final static String QUERY_OPERATE_LIST = "Api/analog/opera_list"; // 他的主页操作明细
    public final static String QUERY_USER_SIGN = "Api/analog/user_sign"; // 用户签到页面
    public final static String USER_SIGN = "Api/analog/do_sign"; // 用户签到页面
    public final static String QUERY_HOT_WARREN_LIST = "Api/Virtualmatch/hot_warren"; // 首页 热门大股神

    public final static String VIR_REG = "Api/Virtualmatch/vir_reg"; // 注册

    public final static String MATCH_DYNAMIC = "Api/Virtualmatch/match_dynamic";//大赛动态页面
    public final static String QUERY_WEEK_RANKING_LIST = "Api/Virtualmatch/get_week_ranking_list";// 短线牛人列表

    public final static String SHARE_LOOK_DETAILS = "Api/Virtualmatch/share_look_details";//赠送积分

    public final static String SIGN_SHARE = "Api/Virtualmatch/sign_share";//赠送积分

    public final static String WX_PAY_SIGN = "Api/pay/sign"; // 微信统一下单
    public final static String WX_CHECK_ORDER = "Api/pay/check_order"; // 微信查询订单
    public final static String WX_CLOSE_ORDER = "Api/pay/close_order"; // 微信关闭订单

    public final static String APP_PAY_ALI = "Api/Apppay/pay";//ali pay

    public final static String UNSET_CONCERN = "Api/Analog/user_unset_concern"; // 取消关注

    public final static String QUERY_ENTRUST_LIST = "Api/Analog/entrust_list"; // 委托列表
    public final static String REMOVE_ENTRUST = "Api/Analog/remove_entrust"; // 撤销委托

    public final static String HOME_USER_RANK = "Api/Virtualmatch/get_all_user_rank"; // 首页牛人动态/最赚钱牛人
    public final static String HOME_WEEK_RANK = "Api/Virtualmatch/get_all_user_week_rank"; // 短线牛人
    public final static String HOME_HOT_RANK = "Api/Virtualmatch/get_all_user_atte_rank"; // 人气牛人

    public final static String QUESTIONAIRE_URL = "https://sojump.com/jq/10232614.aspx"; // 个人中心--问卷调查

    // -------------------------诊股接口--------------------------

    public final static String TEACHER_QUESTION_LIST = "Api/Teacher/ask_list"; // 老师回答问题列表
    public final static String RUSH_ANSWER = "Api/Teacher/rush_answer"; //老师抢答接口
    public final static String QUERY_ASK_INFO = "Api/Teacher/ask_info"; //问题详情
    public final static String TEACHER_ANSWER = "Api/Teacher/teacher_answer"; //问题详情


    public final static String ASK_QUESTION = "Api/Qanda/tw"; // 诊股提问题，下订单
    public final static String QUERY_ORDER_INFO = "Api/Qanda/get_orderinfo"; // 下订单后获取订单信息
    public final static String PAY_ORDER = "Api/Qanda/pay_order"; // 订单支付
    public final static String EXCELLENT_ANSWER_LIST = "Api/Qanda/jc_answer"; // 首页精彩回答
    public final static String DIAGNOSE_INDEX = "Api/Qanda/index"; // 诊股大厅用户首页接口
    public final static String DIAGNOSE_TEACHER_LIST = "Api/Qanda/teacher_list"; // 精英投顾排行榜

    public final static String QUERY_MY_ORDER = "Api/Qianda/my_orders"; // 我的订单
    public final static String QA_DETAIL = "Api/Qianda/ask_info"; // 问答详情页面
    public final static String QA_ASK_ANSWER = "Api/Qianda/my_ask_answer"; // 问股答复
    public final static String POST_EVALUATE = "Api/Qianda/post_evaluate"; // 提交评价

    public final static String QUERY_MY_ASK = "Api/Qianda/my_ask"; // 我的提问


    public final static String POST_ANSWER = "Api/Teacher/post_answer"; // 提交问题答案
    public final static String ANSWER_ADD_GOOD = "Api/Teacher/add_good"; // 添加精彩
    public final static String ANSWER_DEL_GOOD = "Api/Teacher/del_good"; // 提交问题


    public final static String ANSWER_DEL_ASK = "Api/Teacher/del_ask"; // 删除问题
    public final static String REGULAR_STOCK = "Api/Qanda/regular_share"; // 匹配股票名+代码格式是否正确

    public final static String USER_BILL = "Api/Qanda/user_bill";//用户账单列表
    public final static String BILL_INFO = "Api/Qanda/bill_info";//用户账单详情
    public final static String ROOM_JC_ANSWER = "Api/Qanda/room_jc_answer";//老师房间精彩列表


    public final static String QUERY_SHARE_TIC_LIST = "Api/Qanda/shares_tic_list";//个人中心诊股卷列表
    public final static String QUERY_TEACHER_INFO = "Api/Qanda/teacher_info";//老师直播间信息

    public final static String GUESS_MARKET = "Api/index/guess.html";// 猜大盘页面
    public final static String ZNSYTK_URL = "Api/Index/zgsytk";// 投顾付费服务风险揭示及服务协议

    public final static String TEST_HTTPS = "common/demo.json";//https测试


}
