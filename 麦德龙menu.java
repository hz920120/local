<%@ page language="java" contentType="text/html; charset=Utf-8"
    pageEncoding="Utf-8"%>
    <%
    	String user = session.getAttribute("LOGIN_USER").toString();
    	String custid = session.getAttribute("custid").toString();
    	String area = session.getAttribute("area").toString();
    	
    	String view = "none";
    	if(custid != null && custid.equals("HFCS"))
    		view = "block"; 
    	
    	String viewdf = "none";
    	if(custid != null && custid.equals("hblppz"))
    		viewdf = "block"; 
    	
    	String viewla = "block";
    	String viewey = "none";
    	if(custid != null && custid.equals("mtfz")){
    		viewla = "none";
    		viewey = "block";
    	}
    	
    	String type = session.getAttribute("userType").toString();
    	String viewmk = "none";
    	String viewfa = "none";
    	if(type != null && type.equals("2")){
    		viewmk = "block"; 
    	 	viewfa = "block";
    	}
    	
    	String viewdls = "block";
    	if(type != null && (type.equals("5") || type.equals("6")) ){
    	    viewdls = "none";
    	    viewdf = "none";
    	    viewmk = "none";
    	    view = "none";
    	}
    	
    	
    	String viewarea = "none";
    	if(area != null && area.equals("1")){
    		viewarea = "block";
    	}
    	
    	
    	String viewall = "block";
    	String viewagent = "none";

    	if(type != null && type.equals("8")){
            viewagent = "block";
            viewall = "none";
            viewla = "none";
            viewdls= "none";
        }

	%>
<div class="sidebar">
   <div class="userinfo clearfix">
      <img src="images/head.png" alt="" class="head" />
      <div class="txt">
         <p class="name"><%=user %></p>
      </div>
   </div>
   <ul class="sidenav" style="display:block">
       <!-- 麦德龙报表需要改main  -->
      <li><a href="javascript:void(0)" onclick="$('#showpage').attr('src','DailyDetailMdl.jsp');" ><em><img src="images/icon4.png" alt="" /></em><span>订单明细查询</span></a></li>
  	  <%--<li style="display:<%=viewall %>;"><a href="javascript:void(0)" onclick="$('#showpage').attr('src','DailyDetail.jsp');" ><em><img src="images/icon4.png" alt="" /></em><span>当日订单明细查询</span></a></li>--%>
  	  <%--<li style="display:<%=viewall %>;"><a href="javascript:void(0)" onclick="$('#showpage').attr('src','DailyDetailHistory.jsp');" ><em><img src="images/icon4.png" alt="" /></em><span>历史订单明细查询</span></a></li> --%>
   	  <li style="display:<%=viewall %>;"><a href="javascript:void(0)" onclick="$('#showpage').attr('src','RefundDetail.jsp');"><em><img src="images/icon4.png" alt="" /></em><span>退款订单明细查询</span></a></li>
      <%--<li style="display:<%=viewall %>;"><a href="javascript:void(0)" onclick="$('#showpage').attr('src','DailyPos.jsp');"><em><img src="images/icon4.png" alt="" /></em><span>门店POS汇总报表</span></a></li> --%>
      <%--<li style="display:<%=viewall %>;"><a href="javascript:void(0)" onclick="$('#showpage').attr('src','DailyMarket.jsp');"><em><img src="images/icon4.png" alt="" /></em><span>门店汇总报表</span></a></li>  --%>
      <%--<li ><a href="javascript:void(0)" onclick="$('#showpage').attr('src','DailyZfbDetail.jsp');"><em><img src="images/icon4.png" alt="" /></em><span>支付宝明细渠道报表</span></a></li>--%>
      <li ><a href="javascript:void(0)" onclick="$('#showpage').attr('src','DailyPosMdl.jsp');"><em><img src="images/icon4.png" alt="" /></em><span>门店POS汇总报表</span></a></li>
      <li ><a href="javascript:void(0)" onclick="$('#showpage').attr('src','DailyMarketMdl.jsp');"><em><img src="images/icon4.png" alt="" /></em><span>门店汇总报表</span></a></li>
      <li style="display:<%=viewdls %>;"><a href="javascript:void(0)" onclick="$('#showpage').attr('src','DailyCashier.jsp');"><em><img src="images/icon4.png" alt="" /></em><span>门店收银员汇总</span></a></li>
   	  <%--<li style="display:<%=viewdls %>;"><a href="javascript:void(0)" onclick="$('#showpage').attr('src','queryOrder.jsp');" ><em><img src="images/icon4.png" alt="" /></em><span>实时订单查询</span></a></li>--%>
   	   <li style="display:<%=viewdls %>;"><a href="javascript:void(0)" onclick="$('#showpage').attr('src','queryOrderMdl.jsp');" ><em><img src="images/icon4.png" alt="" /></em><span>实时订单查询</span></a></li>
   	  <li style="display:<%=viewdls %>;"><a href="javascript:void(0)" onclick="$('#showpage').attr('src','abnormalOrder.jsp');" ><em><img src="images/icon4.png" alt="" /></em><span>异常流水查询</span></a></li>
      <li style="display:<%=viewall %>;"><a href="javascript:void(0)" onclick="$('#showpage').attr('src','marketlist.jsp');"><em><img src="images/icon4.png" alt="" /></em><span>门店管理</span></a></li>
      <li style="display:<%=viewarea %>;"><a href="javascript:void(0)" onclick="$('#showpage').attr('src','areauserlist.jsp');"><em><img src="images/icon4.png" alt="" /></em><span>区域用户管理</span></a></li>   
      <%--<li style="display:<%=viewall %>;"><a href="javascript:void(0)" onclick="$('#showpage').attr('src','DailyBill.jsp');"><em><img src="images/icon4.png" alt="" /></em><span>订单明细报表T+1</span></a></li>--%>
      <%--<li style="display:<%=viewla %>;"><a href="javascript:void(0)" onclick="$('#showpage').attr('src','DailyStore.jsp');"><em><img src="images/icon4.png" alt="" /></em><span>门店汇总报表T+1</span></a></li>--%>
      <%--<li style="display:<%=viewey %>;"><a href="javascript:void(0)" onclick="$('#showpage').attr('src','DailyStoreEY.jsp');"><em><img src="images/icon4.png" alt="" /></em><span>门店汇总报表T+1</span></a></li> --%>
      <%--<li style="display:<%=viewdf %>;"><a href="javascript:void(0)" onclick="$('#showpage').attr('src','DiffStore.jsp');"><em><img src="images/icon4.png" alt="" /></em><span>门店差异报表T+1</span></a></li>--%>
      <%--<li  style="display:<%=viewmk %>;"><a href="javascript:void(0)" onclick="$('#showpage').attr('src','mkoperating.jsp');"><em><img src="images/icon4.png" alt="" /></em><span>运营分析</span></a></li>--%>
      <li  style="display:<%=view %>;"><a href="javascript:void(0)" onclick="$('#showpage').attr('src','cardActivation.jsp');"><em><img src="images/icon4.png" alt="" /></em><span>礼品卡激活记录</span></a></li> 
      <%--<li style="display:<%=viewfa %>;"><a href="javascript:void(0)" onclick="$('#showpage').attr('src','FormAnalysis.jsp');"><em><img src="images/icon4.png" alt="" /></em><span>业态分析报表T+1</span></a></li>--%>
	  <%--<li style="display:<%=viewagent %>;"><a href="javascript:void(0)" onclick="$('#showpage').attr('src','AgentManage.jsp');" ><em><img src="images/icon4.png" alt="" /></em><span>代理商管理</span></a></li>--%>
	  <!-- <li ><a href="javascript:void(0)" onclick="$('#showpage').attr('src','download.jsp');"><em><img src="images/icon6.png" alt="" /></em><span>微信账单手动下载</span></a></li> -->
   </ul>
   <ul class="sidenav" style="display:none">
   	  <li><a href="javascript:void(0)" onclick="$('#showpage').attr('src','subsettlement.jsp');" ><em><img src="images/icon4.png" alt="" /></em><span>门店日清分结算</span></a></li>
   </ul>
</div>
<script>
$(function(){
	$(".sidenav li").on("click",function(){
		$(this).addClass("curr").siblings().removeClass("curr");
	});
});
</script>