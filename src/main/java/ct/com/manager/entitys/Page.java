package ct.com.manager.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/*
page_id	int(10)	否	0	页面自增id
author_uid	int(10)	否	0	页面作者uid
author_username	varchar(50)	否		页面作者用户名
item_id	int(10)	否	0	项目id
cat_id	int(10)	否	0	父目录id
page_title	varchar(50)	否		页面标题
page_content	text	否		页面内容
order	int(10)	否	99	顺序号。数字越小越靠前
addtime	int(11)	否	0	该记录添加的时间
 */
public class Page {
    private int page_id;             //页面自增id
    private int author_uid;          //页面作者uid
    private String author_username;  //页面作者用户名
    private int item_id;             //项目id
    private int cat_id;             //父目录id
    private String page_title;      //页面标题
    private String page_content;    //页面内容
    private int order;            //顺序号。数字越小越靠前
    private int addtime;           //该记录添加的时间
}
