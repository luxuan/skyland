
function count_total(table_id,price,num,minor_total,grand_total){
	var table_child=document.getElementById(table_id);
	var a;
	var b;
	var sum;
	sum=0;
	var j;
	for(j=1;j<table_child.rows.length-1;j++)
	{
		a=table_child.rows[j].cells[1].innerHTML;
		b=table_child.rows[j].cells[2].innerHTML;
		table_child.rows[j].cells[3].firstChild.innerHTML=a*b;		
		sum=sum+a*b;
	}		
	document.getElementById(grand_total).innerHTML=sum;
}