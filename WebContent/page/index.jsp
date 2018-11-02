<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>梦润首页</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="../css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- js -->
<script type="text/javascript" src="../js/jquery-2.1.4.min.js"></script>
<!-- //js -->
<!-- pop-up-box -->
<link href="../css/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
<!-- //pop-up-box -->
<!-- font-awesome icons -->
<link href="../css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons -->
<link href="http://fonts.googleapis.com/css?family=Work+Sans:100,200,300,400,500,600,700,800,900&amp;subset=latin-ext" rel="stylesheet">
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
</head>
	
<body>
<!-- header -->
	<div class="header">
		<div class="container">
			<div class="agile_header_grid">
				<div class="w3_agile_logo">
					<h1><a href="index.html"><span>M</span>培训中心首页</a></h1>
				</div>
				<div class="agileits_w3layouts_sign_in">
					<ul>
						<li><a href="#small-dialog" class="play-icon popup-with-zoom-anim">登录</a></li>
						<li>联系电话 : <span>400-0852-339</span></li>
					</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="w3_agileits_nav">
				<nav class="navbar navbar-default">
					<div class="navbar-header navbar-left">

					</div>
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
						<nav>
							<ul class="nav navbar-nav">
								<li class="active">
									<a href="index.html">网站首页</a></li>
								<li class="dropdown">
									<a href="#"
									 class="hvr-sweep-to-bottom" data-toggle="dropdown">特色课程<b class="caret"></b></a>
									<ul class="dropdown-menu agile_short_dropdown">
										<li><a href="icons.html">体验式教学</a></li>
										<li><a href="typography.html">访谈教学</a></li>
										<li><a href="#">现场讲解</a></li>
										<li><a href="#">现场观摩</a></li>
										<li><a href="#">影音教学</a></li>
										<li><a href="#">影音教学</a></li>
									</ul>
								</li>
								<li class="dropdown">
									<a href="#"
									 class="hvr-sweep-to-bottom" data-toggle="dropdown">行程配置<b class="caret"></b></a>
									<ul class="dropdown-menu agile_short_dropdown">
										<li><a href="#">红色圣地</a></li>
										<li><a href="#">交通工具</a></li>
										<li><a href="#">特色美食</a></li>
										<li><a href="#">文化产品</a></li>
									</ul>
								</li>
								<li class="dropdown">
									<a href="#"
									 class="hvr-sweep-to-bottom" data-toggle="dropdown">学员风采<b class="caret"></b></a>
									<ul class="dropdown-menu agile_short_dropdown">
										<li><a href="#">学员学习照</a></li>
										<li><a href="#">最佳学员</a></li>
										<li><a href="#">往期学员故事</a></li>
									</ul>
								</li>
								<li class="dropdown">
									<a href="#"
									 class="hvr-sweep-to-bottom" data-toggle="dropdown">培训信息<b class="caret"></b></a>
									<ul class="dropdown-menu agile_short_dropdown">
										<li><a href="#">关于我们</a></li>
										<li><a href="#">红色历史文化教学点</a></li>
										<li><a href="#">绿色发展教学点</a></li>
										<li><a href="#">挂牌单位</a></li>
									</ul>
								</li>
							</ul>
							<div class="agileinfo_search">
								<form action="#" method="post">
									<input type="text" name="Search" placeholder="输入关键字..." required="">
									<input type="submit" value=" ">
								</form>
							</div>
						</nav>
					</div>
				</nav>	
			</div>
		</div>
	</div>
<!-- //header -->
<!-- pop-up-box -->
	<div id="small-dialog" class="mfp-hide w3ls_small_dialog wthree_pop">
		<h3 class="agileinfo_sign">登录</h3>	
		<div class="agileits_signin_form">
			<form action="${pageContext.request.contextPath }/page/seluser.do" method="post">
				<input type="text" name="UID" placeholder="手机号" >
				<input type="password" name="Upassword" placeholder="密码" >
				<div class="agile_remember">
					<div class="agile_remember_left">
						<div class="check">
							<label class="checkbox"><input type="checkbox" name="checkbox"><i> </i>记住密码</label>
						</div>
					</div>
					<div class="agile_remember_right">
						<a href="#">忘记密码</a>
					</div>
					<div class="clearfix"> </div>
				</div>
				<input type="submit" value="登录">
				<p>没有账户？ <a href="#small-dialog1" class="play-icon popup-with-zoom-anim">注册</a></p>
			</form>
		</div>
	</div>
	<div id="small-dialog1" class="mfp-hide w3ls_small_dialog wthree_pop">
		<h3 class="agileinfo_sign">用户注册</h3>	
		<div class="agileits_signin_form">
			<form action="${pageContext.request.contextPath }/page/insertuser.do" method="post">
				<input type="text" name="UID" placeholder="输入您的手机号" >
				<input type="text" name="Uname" placeholder="姓名" >
				<input type="text" name="Usex" placeholder="性别" >
				<input type="text" name="Uage" placeholder="年龄" >
				<input type="password" name="Upassword" placeholder="密码" >
				<input type="submit" value="注册">
				<p>已有账户<a href="#small-dialog" class="play-icon popup-with-zoom-anim">去登录</a></p>
			</form>
		</div>
	</div>
<!-- //pop-up-box -->
<!-- 侧边广告 -->
<div id="left_layer" style="position:fixed;z-index:999999; top:200px; left:0px;">

<a href="https://www.baidu.com"><img src="http://www.mlhd.org/wb/ad/xuanfu/zhifubao.png"><br></a>

<a href="javascript:;" onclick="javascript:document.getElementById('left_layer').style.display='none';"><center>关闭</center></a>

</div>
<div id="right_layer" style="position:fixed;z-index:999999; top:200px; right:0px;">

<a href="https://www.baidu.com"><img src="http://www.mlhd.org/wb/ad/xuanfu/zhifubao.png"><br></a>

<a href="javascript:;" onclick="javascript:document.getElementById('right_layer').style.display='none';"><center>关闭</center></a>

</div>
<!-- //侧边广告 -->
<script src="../js/jquery.magnific-popup.js" type="text/javascript"></script>
<script>
	$(document).ready(function() {
	$('.popup-with-zoom-anim').magnificPopup({
		type: 'inline',
		fixedContentPos: false,
		fixedBgPos: true,
		overflowY: 'auto',
		closeBtnInside: true,
		preloader: false,
		midClick: true,
		removalDelay: 300,
		mainClass: 'my-mfp-zoom-in'
	});
																	
	});
</script>
<!-- banner -->	
	<div class="banner">
	</div>
<!-- //banner -->
<!-- bootstrap-pop-up -->
	<div class="modal video-modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					Lucrative
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>						
				</div>
				<section>
					<div class="modal-body">
						<img src="../images/banner.jpg" alt=" " class="img-responsive" />
						<p>Ut enim ad minima veniam, quis nostrum 
							exercitationem ullam corporis suscipit laboriosam, 
							nisi ut aliquid ex ea commodi consequatur? Quis autem 
							vel eum iure reprehenderit qui in ea voluptate velit 
							esse quam nihil molestiae consequatur, vel illum qui 
							dolorem eum fugiat quo voluptas nulla pariatur.
							<i>" Quis autem vel eum iure reprehenderit qui in ea voluptate velit 
								esse quam nihil molestiae consequatur.</i></p>
					</div>
				</section>
			</div>
		</div>
	</div>
<!-- //bootstrap-pop-up -->
<!-- banner-bottom -->
	<div class="banner-bottom">
		<div class="container">
			<div class="col-md-8 w3l_banner_bottom_left">
				<h3>公司简介</h3>
				<p>梦润集团下辖贵州张明富生态农业有限公司、贵州梦润云大数据有限公司、贵州梦丽雅化妆品有限公司、贵州梦润鹌鹑有限公司、遵义市张明富旅游服务有限公司、遵义市梦润之春建筑有限公司、遵义市梦润农民专业合作社等7家公司。现集团公司用地1000多亩，建有梦润农民工返乡下乡创业园、茅台集团梦润还原土猪养殖观光旅游示范基地、国家级梦润鹌鹑养殖示范区、全国农民工返乡下乡培训基地、农民工文化馆、党建馆、劳模创新工作室等。 
        公司主要产品有梦润鹌鹑系列和梦润化妆品系列产品，均获贵州名牌等多项荣誉，已成长为省级龙头企业和省级扶贫龙头企业。公司拥有30多项专利，7个鹌鹑养殖地方标准，获省丰收二等奖，鹌鹑产业化经营做到了全国行业最前列。</p>
			</div>
			<div class="col-md-4 w3l_banner_bottom_right">
				<img src="../images/1.jpg" alt=" " class="img-responsive" />
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
<!-- //banner-bottom -->
<div class="tlinks">Collect from <a href="http://www.cssmoban.com/" >网页模板</a></div>

<!-- news -->
	<div class="news">
		<div class="container">
			<h3 class="agile_head">Latest News</h3>
			<p class="w3_agile_para">Suspendisse bibendum ex sit amet tellus finibus</p>
			<div class="agileits_w3layouts_news_grids">
				<ul id="flexiselDemo1">	
					<li>
						<div class="agileits_w3layouts_news_grid">
							<div class="w3_agileits_news_grid">
								<img src="../images/3.jpg" alt=" " class="img-responsive" />
								<div class="w3_agileits_news_grid_pos">
									<h4>Date : 15 November 2016</h4>
								</div>
							</div>
							<h5><a href="#" data-toggle="modal" data-target="#myModal">bibendum ex sit amet</a></h5>
							<p>Nunc sodales augue in felis facilisis consectetur.</p>
						</div>
					</li>
					<li>
						<div class="agileits_w3layouts_news_grid">
							<div class="w3_agileits_news_grid">
								<img src="../images/4.jpg" alt=" " class="img-responsive" />
								<div class="w3_agileits_news_grid_pos">
									<h4>Date : 18 November 2016</h4>
								</div>
							</div>
							<h5><a href="#" data-toggle="modal" data-target="#myModal">augue in felis facili</a></h5>
							<p>Nunc sodales augue in felis facilisis consectetur.</p>
						</div>
					</li>
					<li>
						<div class="agileits_w3layouts_news_grid">
							<div class="w3_agileits_news_grid">
								<img src="../images/5.jpg" alt=" " class="img-responsive" />
								<div class="w3_agileits_news_grid_pos">
									<h4>Date : 23 November 2016</h4>
								</div>
							</div>
							<h5><a href="#" data-toggle="modal" data-target="#myModal">facilisis consecte</a></h5>
							<p>Nunc sodales augue in felis facilisis consectetur.</p>
						</div>
					</li>
					<li>
						<div class="agileits_w3layouts_news_grid">
							<div class="w3_agileits_news_grid">
								<img src="../images/6.jpg" alt=" " class="img-responsive" />
								<div class="w3_agileits_news_grid_pos">
									<h4>Date : 28 November 2016</h4>
								</div>
							</div>
							<h5><a href="#" data-toggle="modal" data-target="#myModal">sodales augue felis</a></h5>
							<p>Nunc sodales augue in felis facilisis consectetur.</p>
						</div>
					</li>
					<li>
						<div class="agileits_w3layouts_news_grid">
							<div class="w3_agileits_news_grid">
								<img src="../images/1.jpg" alt=" " class="img-responsive" />
								<div class="w3_agileits_news_grid_pos">
									<h4>Date : 30 November 2016</h4>
								</div>
							</div>
							<h5><a href="#" data-toggle="modal" data-target="#myModal">augue in felis felis</a></h5>
							<p>Nunc sodales augue in felis facilisis consectetur.</p>
						</div>
					</li>
				</ul>
				<script type="text/javascript">
						$(window).load(function() {
							$("#flexiselDemo1").flexisel({
								visibleItems: 4,
								animationSpeed: 1000,
								autoPlay: true,
								autoPlaySpeed: 3000,    		
								pauseOnHover: true,
								enableResponsiveBreakpoints: true,
								responsiveBreakpoints: { 
									portrait: { 
										changePoint:480,
										visibleItems: 1
									}, 
									landscape: { 
										changePoint:640,
										visibleItems:2
									},
									tablet: { 
										changePoint:768,
										visibleItems: 3
									}
								}
							});
							
						});
				</script>
				<script type="text/javascript" src="../js/jquery.flexisel.js"></script>
			</div>
		</div>
	</div>
<!-- //news -->
<!-- stats -->
	<div class="stats">
		<div class="wthree_stat">
			<div class="container">
				<div class="col-md-5 wthree_stat_left">
					<h3>Our Stats</h3>
					<p>Nullam blandit condimentum tellus, eu sagittis leo pellentesque nec. 
						Integer semper risus commodo neque semper.</p>
				</div>
				<div class="col-md-7 wthree_stat_right">
					<ul>
						<li>
							<div class="wthree_stat_right1">
								<i class="fa fa-heart" aria-hidden="true"></i>
								<h4>People Loved</h4>
								<p class="counter">324</p> 
							</div>
						</li>
						<li>
							<div class="wthree_stat_right1">
								<i class="glyphicon glyphicon-piggy-bank" aria-hidden="true"></i>
								<h4>Save Income</h4>
								<p class="counter">412</p> 
							</div>
						</li>
						<li>
							<div class="wthree_stat_right1">
								<i class="glyphicon glyphicon-thumbs-up" aria-hidden="true"></i>
								<h4>Creative Design</h4>
								<p class="counter">231</p> 
							</div>
						</li>
					</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<div class="w3layouts_newsletter">
			<div class="container">
				<div class="w3layouts_newsletter_left">
					<h3>Subscribe to our newsletter</h3>
				</div>
				<div class="w3layouts_newsletter_right">
					<form action="#" method="post">
						<input type="email" name="Email" placeholder="Email..." required="">
						<input type="submit" value="Subscribe">
					</form>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
<!-- //stats -->
<!-- stats -->
	<script src="../js/waypoints.min.js"></script> 
	<script src="../js/counterup.min.js"></script> 
	<script>
		jQuery(document).ready(function( $ ) {
			$('.counter').counterUp({
				delay: 20,
				time: 1000
			});
		});
	</script>
<!-- stats -->
<!-- footer -->
	<div class="footer">
		<div class="container">
			<div class="w3_footer_grids">
				<div class="col-md-4 w3_footer_grid">
					<h2><a href="index.html"><span>L</span>ucrative</a></h2>
					<p>Aliquam lacus tur <a href="#">http:///lucrative.com</a> lobortis quis dolor sed, 
						nec convallis velit vestibulum ac dignissim rhoncus neque.</p>
				</div>
				<div class="col-md-3 w3_footer_grid">
					<div class="w3l_footer_grid">
						<i class="fa fa-home" aria-hidden="true"></i>
					</div>
					<h4>地址</h4>
					<p>贵州省遵义市汇川区团泽镇梦润大道梦润源89号</p>
				</div>
				<div class="col-md-2 w3_footer_grid">
					<div class="w3l_footer_grid">
						<i class="fa fa-phone" aria-hidden="true"></i>
					</div>
					<h4>电话</h4>
					<p>400-0852-339</p>
				</div>
				<div class="col-md-3 w3_footer_grid">
					<div class="w3l_footer_grid">
						<i class="fa fa-envelope" aria-hidden="true"></i>
					</div>
					<h4>邮箱</h4>
					<p><a href="mailto:info@example.com">info@example1.com</a></p>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<div class="copyright">
		<div class="container">
			<div class="w3ls_copyright_left">
				<ul>
					<li><a href="index.jsp">首页</a></li>
					<li><a href="about.html">公司简介</a></li>
					<li><a href="contact.html">联系我们</a></li>
				</ul>
			</div>
			<div class="w3ls_copyright_right">
				<ul>
					<li><a href="#" class="w3_agile_facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
					<li><a href="#" class="agile_twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
					<li><a href="#" class="w3_agile_dribble"><i class="fa fa-dribbble" aria-hidden="true"></i></a></li>
					<li><a href="#" class="w3_agile_vimeo"><i class="fa fa-vimeo" aria-hidden="true"></i></a></li>
				</ul>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
<!-- //footer -->
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="../js/move-top.js"></script>
<script type="text/javascript" src="../js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script>
<!-- start-smoth-scrolling -->
<!-- for bootstrap working -->
	<script src="../js/bootstrap.js"></script>
<!-- //for bootstrap working -->
<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
<!-- //here ends scrolling icon -->
</body>
</html>