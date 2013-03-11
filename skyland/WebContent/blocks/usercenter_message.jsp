<%@ page language="java" contentType="text/html; charset=GB2312"  pageEncoding="GB2312"%>

  <link href=blocks/main.css type=text/css rel=stylesheet>

  <link href=blocks/usercenter.css type=text/css rel=stylesheet>
  <meta http-equiv="Content-Type" content="text/html; charset=GB2312" />
  
  
  <script type="text/javascript">
	function change(display_id,hide_id,display_buttom,hide_buttom)
{
	var num=eval(display_id+".style.display"); 
	if(num=="none")
	{
		eval(display_id+".style.display=''");
		
		document.getElementById(display_buttom).className="choose"; 
        eval(hide_id+".style.display='none'");
		document.getElementById(hide_buttom).className="nochoose"; 
	}
}
</script>


  
  <table width="200" border="0"  cellpadding="0" cellspacing="0"   class="choose" id="shop_buttom">
    <tr>
      <td align="left" width="4" class="left"></td>
      <td align="center"><a href="#" onclick="change('shop_comment','goods_comment','shop_buttom','goods_buttom')">发出信息</td>
      <td align="right" width="4" class="right"></td>
      </tr>
  </table>    
  
  <table width="200" border="0"  cellpadding="0" cellspacing="0"  class="nochoose" id="goods_buttom">
    <tr>
      <td align="left" width="4" class="left"></td>
      <td align="center"><a href="#" onclick="change('goods_comment','shop_comment','goods_buttom','shop_buttom')">收到信息</a></td>
      <td align="right" width="4" class="right"></td>
      </tr>
  </table>    
  
  
  <table border="0" cellpadding="0" cellspacing="0" width="100%" id="shop_comment" align="center" class="message_table" >
    <tr >
      <th background="imgs/images/table_bj_center.gif" align="center" height="26" >
        接收者</th>
      <th background="imgs/images/table_bj_center.gif" align="center">信息</th>
      <th background="imgs/images/table_bj_center.gif" align="center">时间</th>
      <th background="imgs/images/table_bj_center.gif" align="center">操作</th>
      </tr>
    <tr>
      <td height="30" align="center" >爱你一万年</td>
      <td align="center">最近怎么样？</td>
      <td align="center">2010/9/5</td>
      <td align="center">删除</td>
      </tr>
    <tr align="right" >
      <td height="30" colspan="4" align="right">
        共12条评价，显示1-12条</span>
        首页             	上一页 &lt; &lt;             	                	[<font color='#FF0000'>1</font>]            	            	下一页 &gt; &gt;            	末页    			    			
        <input type='text' value='1' id='goPage' size='3' />
      <input type='button' value='确定' onclick='' />                          </td>
    </tr>
    </table>
    
  <table border="0" cellpadding="0" cellspacing="0" width="100%" id="goods_comment" align="center" class="message_table" style=" display:none;"   >
  <tr>
    <th background="imgs/images/table_bj_center.gif" align="center" height="26" >发出者</th>
    <th background="imgs/images/table_bj_center.gif" align="center">信息</th>
    <th background="imgs/images/table_bj_center.gif" align="center">时间</th>
    <th background="imgs/images/table_bj_center.gif" align="center">操作</th>
    </tr>
    <tr>
      <td height="30" align="center">爱你一万年</td>
      <td align="center">很好！</td>
      <td align="center">2010/9/5</td>
      <td align="center">删除</td>
      </tr>
    <tr align="right" >
      <td height="30" colspan="4" align="right">
        共12条评价，显示1-12条</span>
        首页             	上一页 &lt; &lt;             	                	[<font color='#FF0000'>1</font>]            	            	下一页 &gt; &gt;            	末页    			    			
        <input type='text' value='1' id='goPage' size='3' />
      <input type='button' value='确定' onclick='' />                          </td>
    </tr>
  </table>

