<?php

include("functions.php");

$im = fopen("base/intermidiate.txt", "r") ;
$data = fread($im,filesize("base/intermidiate.txt"));
fclose($im);
$darr=explode(";",$data);
$ndar=count($darr);
$i=-1;
foreach ($darr as $p) {
	$i++;
	$i<=$ndar;
	${"p".$i}=$p;
}

$result=$p0($p1,$p2);

$im = fopen("base/intermidiate.txt", "w") ;
$data = fwrite($im,$result);
fclose($im);


?>