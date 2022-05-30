<?php
$get_file = file_get_Contents('hello.txt');
file_put_contents('world.txt', $get_file);
echo "file copied";
?>
