use skyland
go
create table big_sort
(
	num		nvarchar(50)	primary key,			--大类编号
	name_	nvarchar(50)	not null,				--大类名字
	is_hot	bit				null,					--是否热卖
)
go 
create table samll_sort
(
	num			nvarchar(50)	primary key,		--小类编号
	name_		nvarchar(50)	not null,			--小类名字
	spec		nvarchar(50)	not null,			--规格
	price		nvarchar(50)	not null,			--价格
	sort_num	nvarchar(50)	not null,			--所属大类的编号
	shop_num	nvarchar(50)	not null,			--所属商店的编号
	brand		nvarchar(50)	null,				--牌子
	pic		nvarchar(50)	null,				--商品图片
	is_crazy	bit				null,				--是否抢购
	is_fresh	bit				null,				--是否新品
	is_bargain	bit				null,				--是否特价
	is_hot		bit				null,				--是否热卖
	remark		text			null,				--备注
)
go 
create table goods
(
	num			nvarchar(50)	primary key,		--商品编号
	name_		nvarchar(50)	not null,			--商品名字
	samll_sort	nvarchar(50)	not null,			--所属小类的编号
	is_sold		bit				null,				--是否卖出
	buy_user	nvarchar(50)	null,				--买者编号
	
)
go 
create table shop
(
	num			nvarchar(50)	primary key,		--商店编号
	name_		nvarchar(50)	not null,			--商店名字
	privince	nvarchar(50)	not null,			--所属省份
	city		nvarchar(50)	not null,			--所属市
	address		nvarchar(50)	not null,			--具体地址
	phone		nvarchar(50)	not null,			--电话
	shopkeeper	nvarchar(50)	not null,			--店主
	score		int				not null,			--分数
	amount		int				not null,			--商品数量
	deal_num	int				not null,			--交易量
	fax			nvarchar(50)	null,				--传真
	e_mail		nvarchar(50)	null,				--e-mail
	pic			nvarchar(50)	not null,			--商店图片
	license		nvarchar(50)	not null,			--商店营业执照
	remark		text			null,				--备注
)
go 
create table users
(
	num				nvarchar(50)	primary key,		--用户编号
	account			nvarchar(50)	not null,			--用户账号
	password		nvarchar(50)	not null,			--用户密码
	real_name		nvarchar(50)	not null,			--真实姓名
	phone			nvarchar(50)	null,				--电话
	e_mail			nvarchar(50)	null,				--e-mail
	address			nvarchar(50)	not null,			--具体地址
	zip_code		nvarchar(50)	not null,			--邮编
	is_donttalk		bit				null,				--是否被禁言
	is_screem		bit				null,				--是否被屏蔽
	register_time	nvarchar(50)	not null,			--注册时间
	score			int				not null,			--分数
	last_login_time	nvarchar(50)	null,				--上次登录时间
	remark			text			null,				--备注
)
go
create table deals
(
	num			nvarchar(50)	primary key,		--交易编号
	small_sort	nvarchar(50)	not null,			--商品小类编号
	amount		int				not null,			--数量
	price		nvarchar(50)	not null,			--价格
	time_		nvarchar(50)	not null,			--时间
	status		int				not null,			--状态（定义：
													--		0为买家未付款
													--		1为买家付款，卖家为发货
													--		2为卖家已发货，买家未收到
													--		3为买家已收到，交易成功
													--		）
)
go
create table news
(
	num			nvarchar(50)	primary key,		--资讯编号
	sort		nvarchar(50)	not null,			--所属类别
	name_		nvarchar(50)	not null,			--标题
	content_	text			not null,			--内容
	time_		nvarchar(50)	not null,			--时间
	shop_num	nvarchar(50)	null,				--所属商店的编号
	remark		text			null,				--备注
)
go
create table comment
(
	num			nvarchar(50)	primary key,		--评论编号
	user_num	nvarchar(50)	not null,			--评论者编号
	is_shop		bit				null,				--是否对商店评论
	shop_num	nvarchar(50)	null,				--商店编号
	is_goods	bit				null,				--是否对商品评论
	goods_sort	nvarchar(50)	null,				--商品小类别编号
	is_screem	bit				null,				--是否屏蔽
	ip			nvarchar(50)	not null,			--评论者ip
)
go
create table admin
(
	num				nvarchar(50)	primary key,		--管理员编号
	account			nvarchar(50)	not null,			--账号
	password		nvarchar(50)	not null,			--密码
	real_name		nvarchar(50)	not null,			--真实姓名
	phone			nvarchar(50)	null,				--电话
	e_mail			nvarchar(50)	null,				--e-mail
	address			nvarchar(50)	null,				--地址
	goods_manage	bit				not null,			--是否对商品有管理权
	shop_manage		bit				not null,			--是否对商店有管理权
	user_manage		bit				not null,			--是否对用户有管理权
	info_manage		bit				not null,			--是否对信息由管理权
	deals_manage	bit				not null,			--是否对订单有管理权
	sort_manage		bit				not null,			--是否对类别有管理权
	last_ip			nvarchar(50)	null,				--上次登录的ip
	last_login_time	nvarchar(50)	null,				--上次登录的时间
	is_screem		bit				null,				--是否屏蔽
)
go
create table super_admin
(
	account			nvarchar(50)	not null,			--账号
	password		nvarchar(50)	not null,			--密码
	e_mail			nvarchar(50)	null,				--e-mail
	last_ip			nvarchar(50)	null,				--上次登录的ip
	last_login_time	nvarchar(50)	null,				--上次登录的时间
)