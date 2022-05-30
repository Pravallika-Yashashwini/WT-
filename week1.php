<?php
echo" The prime numbers between 1 to 50 \n" ."<br>";
for($i=1;$i<=50;$i++){
$count=0;
for($j=1;$j<=50;$j++){
if($i%$j==0)
{
$count++;
}
}
if($count==2){
echo $i." ";
}
}
?>
