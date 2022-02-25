echo off
echo criar uma pasta de estrutura SO
md html_local
echo acessando a pasta "html local"
cd html_local
echo Criando subpastas "assents,styles,scripts"
md assents
md styles
md scripts
md pages
echo Saindo da pasta html local  
cd ..
echo mostrando o que foi feito
dir
tree