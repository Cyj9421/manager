package ct.com.manager.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/*
item_id	int(10)	否		项目id、自增id
item_name	varchar(50)	否		项目名
item_description	varchar(225)	否		项目描述
uid	int(10)	是		创建人uid
username	varchar(50)	否		创建人用户名
password	varchar(50)	否		项目密码。可为空
addtime	int(11)	否		项目添加的时间，时间戳
 */
public class Item {
    private int item_id;             //项目id、自增id
    private String item_name;          //项目名
    private String item_description;   //项目描述
    private int uid;                 //创建人uid
    private String username;      //创建人用户名
    private String password;    //项目密码。可为空
    private int addtime;           //项目添加的时间，时间戳
}
