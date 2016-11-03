package com.example.wuxiang.mymi.entitys;

/**
 * Created by 姚 坤 on 2016/10/13.
 */
public class NetAddress {

    //此应用的网络基本地址
    public static final String BASE_ADDRESS = "http://www.golehe.com";

    //此应用的网络附加地址
    public static final String ADDITION_ADDRES = "/phone/new_api.php?m=";


    //此应用的搜索基本地址
    public static final String SEARCH_BASE="http://mi900ss.hz.taeapp.com";

    //此应用的搜索附加地址
    public static final String SEARCH_ADDITION="/mi/api.php?m=getCouponItems&";



    public static class TYPE_KEY {
        //页面类型的key
        public static final String TYPE_SROT = "sort";
        //页面对应的页数的key 取值为int
        public static final String TYPE_PAGE = "page";
        //页面大小的key  取值为int
        public static final String TYPE_PAGE_SIZE = "page_size";
        //页面的子类型的key
        public static final String TYPE_CID = "cid";
        //页面的子类型的key
        public static final String TYPE_KEY_WORD = "keyword";
    }

    //页面类型的key的对应取值（Value）
    public static class M_TYPE_VALUE {
        //首页的广告
        public static final String M_TYPE_HOME = "getIndexLoadData";
        //每日更新
        public static final String M_TYPE_UPDATA = "getUpdateItem";
        //超及反
        public static final String M_TYPE_CHAOFAN_ITEM = "getChaofanItem";
        //天天特价
        public static final String M_TYPE_DIJIA_ITEM = "getDijiaItem";
        //品牌特卖
        public static final String M_TYPE_PINPAI_LIST = "getPinpaiList";
        //商城返利
        public static final String M_TYPE_MALL_BY_CID = "getMallByCid";
        //购物返利
        public static final String M_TYPE_COUPON_ITEM = "getCouponItems";
        //爱逛
        public static final String M_TYPE_AIGUANG_CATETYPE = "getaiguangCateType";
        //积分商城
        public static final String M_TYPE_HUAN_LIST = "huan_list";

    }


    //CID 对应的取值
    public static class CID_TYPE_VALUE {
        //全部
        public static final String CID_TYPE_ALL = "";
        //女装
        public static final String CID_TYPE_WOMEN = "10001";
        //男装
        public static final String CID_TYPE_MEN = "10017";
        //内衣
        public static final String CID_TYPE_NEIYI = "10009";
        //母婴
        public static final String CID_TYPE_MUYING = "10005";
        //美妆
        public static final String CID_TYPE_MEIZHUANG = "10003";
        //箱包
        public static final String CID_TYPE_XIANGBAO = "10002";
        //美食
        public static final String CID_TYPE_MEISHI = "10004";
        // 鞋品
        public static final String CID_TYPE_XIEPIN = "10018";
        //家具
        public static final String CID_TYPE_JIAJU = "10006";
        //数码
        public static final String CID_TYPE_SHUMA = "10007";
        //家电
        public static final String CID_TYPE_JIADIAN = "10012";
        //配饰
        public static final String CID_TYPE_PEISHI = "10014";
        //文体/其他
        public static final String CID_TYPE_QITA = "10008";

        public static String[] toArray() {
            return new String[]{CID_TYPE_ALL,CID_TYPE_WOMEN,CID_TYPE_MEN,CID_TYPE_NEIYI,CID_TYPE_MUYING
                    ,CID_TYPE_MEIZHUANG,CID_TYPE_XIANGBAO,CID_TYPE_XIEPIN,CID_TYPE_MEISHI,CID_TYPE_JIAJU
                    ,CID_TYPE_SHUMA,CID_TYPE_JIADIAN,CID_TYPE_PEISHI,CID_TYPE_QITA
            };
        }
    }
    public static class SORT_VALUE{
        public static final String RENQI_UP="commissionVolume_asc";
        public static final String RENQI_DOWN="commissionVolume_desc";
        public static final String XINYONG_UP="credit_asc";
        public static final String XINYONG_DOWN="credit_desc";
        public static final String FANLI_UP="commissionRate_asc";
        public static final String FANLI_DOWN="commissionRate_desc";
        public static final String XIAOLIANG_UP="commissionNum_asc";
        public static final String XIAOLIANG_DOWN="commissionNum_desc";

    }

    //   首页 轮播+发现好货：GET
    public static final String Home_AD_Bean = "http://www.golehe.com/phone/new_api.php?m=getIndexLoadData";

    //    爱逛
    public static final String AIGUANG="http://phone.sqydao.com/phone/new_api.php?m=getaiguangCateType";


    //    每日准时更新： GET：
    public static final String Home_Refresh_EveryDay = "http://www.golehe.com/phone/new_api.php?m=getUpdateItem&page=";
//SCFL
    public static final String SCFL = "http://www.golehe.com/phone/new_api.php?m=getMallByCid&page=";

//    PPTM
    public static final String PPTM = "http://www.golehe.com/phone/new_api.php?m=getPinpaiList&page=1&cid=";

//    PPTMDETAIL
    public static final String PPTMDETAIL = "http://www.golehe.com/phone/new_api.php?m=getPinpaiItemById&page=1&page_size=10&id=";


    public static final String CREDITS_URI = "http://www.golehe.com/phone/new_api.php?m=huan_list&do=list&getType=1&page=1&cid=%d";
public static final String CREDITS_DETAILS="http://www.golehe.com/phone/new_api.php?m=huan_list&do=view&id=%s";

    //返利教程
   public static final String FLJC="http://www.golehe.com/phone/html/fanli_course.php";
    //关于我们
    public static final String GYWM="http://www.golehe.com/phone/html/about_us.php";
    //帮助中心
    public static final String BZZX="http://www.golehe.com/phone/html/help_center.php";
    //奖励规则
    public static final String JLGZ="http://www.golehe.com/phone/html/invite_rule.php";

    //摇一摇
    public static final String YYY = "http://www.golehe.com/phone/new_api.php?m=shake&uid=";

//    站内消息
    public static final String ZNXX = "http://www.golehe.com/phone/new_api.php?m=msg&uid=2664&page=1&page_size=10";

//  邀请记录
    public static final String YQJL="http://www.golehe.com/phone/new_api.php?m=myInviteRecords&uid=";
    //淘宝   全部
    public static final String TB_ALL="http://www.golehe.com/phone/new_api.php?m=order&do=baichuan&uid=";
    //    超级返    全部   GET
//    public static final String Super_Back_Bean = "http://www.golehe.com/phone/new_api.php?m=getChaofanItem&page=1";


    //    超级返    分类基础
//    public static final String Super_Back_Base = "http://www.golehe.com/phone/new_api.php?m=getChaofanItem&page=1&cid=";


    //    女装	 GET    http://www.golehe.com/phone/new_api.php?m=getChaofanItem&page=1&cid=10001
//    public static final String WOMEN = "http://www.golehe.com/phone/new_api.php?m=getChaofanItem&page=1&cid=10001";

    //    男装   GET    http://www.golehe.com/phone/new_api.php?m=getChaofanItem&page=1&cid=10017
//    public static final String MEN = "http://www.golehe.com/phone/new_api.php?m=getChaofanItem&page=1&cid=10017";

    //    内衣   GET   	http://www.golehe.com/phone/new_api.php?m=getChaofanItem&page=1&cid=10009
//    public static final String underwear = "http://www.golehe.com/phone/new_api.php?m=getChaofanItem&page=1&cid=10009";

//    母婴   GET    http://www.golehe.com/phone/new_api.php?m=getChaofanItem&page=1&cid=10005
//    美妆   GET    http://www.golehe.com/phone/new_api.php?m=getChaofanItem&page=1&cid=10003
//    箱包   GET    http://www.golehe.com/phone/new_api.php?m=getChaofanItem&page=1&cid=10002
//    美食   GET    http://www.golehe.com/phone/new_api.php?m=getChaofanItem&page=1&cid=10004
//    鞋品   GET    http://www.golehe.com/phone/new_api.php?m=getChaofanItem&page=1&cid=10018
//    家具   GET    http://www.golehe.com/phone/new_api.php?m=getChaofanItem&page=1&cid=10006
//    数码   GET    http://www.golehe.com/phone/new_api.php?m=getChaofanItem&page=1&cid=10007
//    家电   GET    http://www.golehe.com/phone/new_api.php?m=getChaofanItem&page=1&cid=10012
//    配饰   GET    http://www.golehe.com/phone/new_api.php?m=getChaofanItem&page=1&cid=10014
//    文体/其他   GET    http://www.golehe.com/phone/new_api.php?m=getChaofanItem&page=1&cid=10008
//    天天特价  全部   GET    http://www.golehe.com/phone/new_api.php?m=getDijiaItem&page=1
//    女装          http://www.golehe.com/phone/new_api.php?m=getDijiaItem&page=1&cid=10001
//品牌特卖  getPinpaiList
//

//    商城返利 综合商城  GET   http://www.golehe.com/phone/new_api.php?m=getMallByCid&page=1
//    服饰       http://www.golehe.com/phone/new_api.php?m=getMallByCid&page=1&cid=15
//    数码   cid=16
//    美容    cid=17
//    家庭   cid=18
//    母婴   cid=19
//    图书   cid=20
//    团购   cid=21
//    配饰   cid=22
//    酒店   cid=23
//    虚拟   cid=24
//    食品	cid=25
//
//    返利教程   http://www.golehe.com/phone/html/fanli_course.php
//
//
//    购物返利   搜索    http://mi900ss.hz.taeapp.com/mi/api.php?m=getCouponItems&keyword=哈哈&page=1
//    详细教程 	http://www.golehe.com/phone/html/fanli_course.php
//
//
//
//
//    积分商城    全部  （虚拟、实物） http://www.golehe.com/phone/new_api.php?m=huan_list&do=list&getType=1&page=1

}
