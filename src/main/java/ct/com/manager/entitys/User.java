package ct.com.manager.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/*
uid	int(10)	否
username	varchar(20)	否		用户名
groupid	tinyint(2)	否	2	1为管理员，2为普通用户
password	varchar(50)	否		密码
avatar	varchar(200)	是		头像
avatar_small	varchar(200)	是		小头像
email	varchar(50)	否		邮箱
name	varchar(15)	是		昵称
reg_time	int(11)	否	0	注册时间
last_login_time	int(11)	否	0	最后一次登录时间
 */
public class User {
    private int uid;//用户id
    private String username;//用户名
    private int groupid;//1为管理员，2为普通用户 默认为2
    private String password;//密码
    private String avatar;//头像
    private String avatar_small;//小头像
    private String email;//邮箱
    private String name;//昵称
    private int reg_time;//注册时间
    private int last_login_time;//最后一次登录时间
}
