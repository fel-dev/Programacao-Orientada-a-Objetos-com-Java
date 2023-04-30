@echo off & setlocal enableextensions enableDelayedExpansion 

if not "%1" == "max" start /MAX cmd /c %0 max & exit/b

goto main

rem contagem regressiva da apresentação
set contador=10
for /l %%i in (%contador%,-1,1) do (  
    cls  
    echo    ^(
    echo    ^)^\
    echo  ^(^(^(^_^)
    echo  ^)^\^___
    echo ^(^(^/ __^|
    echo  ^| ^(^__
    echo   ^\^___^|OMPILATOR JAVAC AUTOMATION
    echo.
    echo Um script para facilitar meus estudos de Java POO do Algaworks.
    echo.
    echo FCC- Felipe Correa Carneiro - 2023
    echo.
    echo Auto start in: %%is
    timeout /t 1 >nul
)
cls

rem Imprimir instruções para o programador
echo +-----------------------------------------------------------------------   +
echo ^| INSTRUCOES PARA O PROGRAMADOR:                                          ^|
echo +-----------------------------------------------------------------------   +
echo ^| Substitua "X.X.X_XX" na segunda linha pelo numero da versao do JDK      ^|
echo ^| instalado em seu computador.                                            ^|
echo ^| Certifique-se de que o caminho para o executavel "javac.exe" esta       ^|
echo ^| corretamente configurado na variavel "javac".                           ^|
echo ^| O comando "setlocal enabledelayedexpansion" e necessario para           ^|
echo ^| habilitar a expansao de variaveis dentro de um loop "for".              ^|
echo ^| O loop "for /r" percorre recursivamente todos os arquivos com           ^|
echo ^| extensao ".java" na pasta atual e subpastas.                            ^|
echo ^| A variavel "file" armazena apenas o nome do arquivo, sem a extensao.    ^|
echo ^| A variavel "dir" armazena o caminho da pasta em que o arquivo esta      ^|
echo ^| localizado.                                                             ^|
echo ^| O comando "cd !dir!" muda o diretorio para a pasta do arquivo atual     ^|
echo ^| antes de executar o comando de compilacao.                              ^|
echo ^| A mensagem de conclusao e exibida ao final, seguida de uma pausa para   ^|
echo ^| evitar que o prompt seja fechado imediatamente.                         ^|
echo +-----------------------------------------------------------------------   +

set contador=2
for /l %%i in (%contador%,-1,1) do ( 
  timeout /t 1 >nul
)
cls

echo    ^(
echo    ^)^\
echo  ^(^(^(^_^)
echo  ^)^\^___
echo ^(^(^/ __^|
echo  ^| ^(^__
echo   ^\^___^|OMPILANDO TUDO
echo.
echo Evite que o prompt seja fechado imediatamente.
echo.

:main

echo %time% Looking for Java files...
echo.
@REM Mostra total de arquivos .java encontrados
set count=0
for /r %%f in (*.java) do (
  @rem incrementa a variável "count" em 1 para cada arquivo encontrado.
  set /a count+=1 
  @rem echo %%~nf.java
)
echo.
echo Vamos compilar %count% arquivos Java.
echo.
echo.
echo %time% Compiling Java files...
echo.

setlocal enabledelayedexpansion

@rem Definir variáveis de ambiente %ProgramFiles%\Java\jdk-20\bin\javac
set javac="G:\Program Files\Java\jdk-20\bin\javac"
set path=%path%;G:\Program Files\Java\jdk-20\bin

@rem set "root_directory=C:\temp\fel-dev\"
set "log_file=%~dp0log.txt"

@REM percorre recursivamente todas as subpastas e procura por arquivos com a extensão .java. Para cada arquivo encontrado, o comando dentro do loop é executado.
for /r %%f in (*.java) do (

    @rem Obter o nome e caminho do arquivo Java atual
    set file=%%~nf
    set dir=%%~pf

    @rem Alterar o diretório atual para o diretório do arquivo Java atual
    cd !dir!

    @rem Exibir mensagem de progresso
    echo %time% Compilando !dir! !file!.java
    
    @rem Log com data e hora atual com erros de compilação
    echo %date% %time% %COMPUTERNAME% %username% !dir! !file!.java >> "%log_file%" 2>&1
    
    @rem Compilar arquivo Java
    @rem %javac% !file!.java
    
    @rem Log de com data e hora e informações sobre o resultado da compilação
    %javac% !file!.java >> "%log_file%" 2>&1 & %javac% !file!.java

)
echo.
echo Done!

pause

set contador=10
for /l %%i in (%contador%,-1,1) do ( 
  timeout /t 1 >nul
)
cls

    
rem Exibir mensagem de conclusão
echo. 
echo    ^(
echo    ^)^\
echo  ^(^(^(^_^)
echo  ^)^\^___
echo ^(^(^/ __^|
echo  ^| ^(^__
echo   ^\^___^|ompilated with success!
echo.
echo Um arquivo log.txt criado na pasta deste script.
echo.
echo Se houve erros de compilacao, verifique o arquivo log.
echo.
echo !dir!log.txt
echo.
echo Exiting...
set contador=10
for /l %%i in (%contador%,-1,1) do ( 
  timeout /t 1 >nul
)
