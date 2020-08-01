ls
pwd
cd Downloads
ls
cd home/cloudera/Downloads/
ls
cd Downloads
ls
unzip Relacional.zip
sudo yum install http://download.postgresql.org/pub/repos/yum/reporpms/EL-6-x86_64/pgdg-redhat-repo-latest.noarch.rpm
sudo gedit /etc/yum.repos.d/pgdg-redhat-all.repo
sudo install postgresql11
install --help
sudo yum install postgresql11
sudo yum install postgresql11-server
sudo service postgres-11 initdb
sudo servie postgresql-11 initdb
sudo service postgresql-11 initdb
sudo chkconfig postgresql-11 on
sudo service postgresql-11 start
sudo -u postgres psql
cd /home/cloudera/Downloads/
ls
unzip dimensional.zip
sudo -u postgres sql
\c ed
sudo -u postgres psql
cd /home/cloudera/Downloads/
ls
unzip nosql.zip
sudo cp mongodb-org-4.0.repo /etc/yum.repos.d/
sudo yum install -y mongodb-org
PDATE dimensional.KPI SET Meta = 220000   where Mes =1;
UPDATE dimensional.KPI SET Meta = 220000   where Mes =2;
UPDATE dimensional.KPI SET Meta = 230000   where Mes =3;
UPDATE dimensional.KPI SET Meta = 235000   where Mes =4;
UPDATE dimensional.KPI SET Meta = 240000   where Mes =5;
UPDATE dimensional.KPI SET Meta = 250000   where Mes =6;
UPDATE dimensional.KPI SET Meta = 255000   where Mes =7;
UPDATE dimensional.KPI SET Meta = 260000   where Mes =8;
UPDATE dimensional.KPI SET Meta = 262500   where Mes =9;
UPDATE dimensional.KPI SET Meta = 265000   where Mes =10;
UPDATE dimensional.KPI SET Meta = 267000   where Mes =11;
cd /etc/yum.repos.d/
sudo gedit mongodb-org-*
sudo yum install --nogpgcheck -y mongodb-org
cd ~
sudo service mongod start
sudo chkconfig mongod on
mongo
db.posts.insert([
... {nome:"Antonio",postagem:"Minha bike quebrou",data="26-05-2019",
... ]
... )
mongo
ls
cd Downloads/
sudo mkdir /home/cloudera/bkpmongo
sudo mongodump --out home/cloudera/bkpmongo/ --db dbmidias
ls /home/cloudera/bkpmongo/
ls /home/cloudera/
cd bkpmongo
cd /home/clouders/bkpmongo/
cd /home/clouders/bkpmongo
cd /home/cloudera/bkpmongo
ls
sudo mkdir /home/cloudera/exportmongo
sudo mongoexport --db dbmidias -- collection posts --out /home/cloudera/exportmongo/posts.json
sudo mongoexport --db dbmidias --collection posts --out /home/cloudera/exportmongo/posts.json
sudo mongoexport --db dbmidias --collection post --out /home/cloudera/exportmongo/post.json
cat /home/cloudera/exportmongo/post.json
cat /home/cloudera/Downloads/posts.json
mongoimport --db dbmidias --collection post --file /home/cloudera/Downloads/posts.json
mongo
ls
hadoop jar /home/cloudera/MRProgramDemo.jar PackageDemo.WordCount /contar/pesquisa.txt /contar2
hdfs dfs -ls /contar2
hdfs dfs -cat /contar2/part-r-00000
hdfs dfs -ls /user/hive/warehouse/
cd Downloads/
ls
unzip hadoop.zip
cat pesquisa.txt
cat WordCount.java 
hdfs dfs -mkdir /contar/
hdfs dfs -ls /
hdfs dfs - put pesquisa.txt  /contar/pesquisa.txt
hdfs dfs -put pesquisa.txt  /contar/pesquisa.txt
hdfs dfs -ls /contar/
sudo -u postgres psql
sudo vi /var/lib/pgsql/11/data/pg_hba.conf
sudo service postgresql-11 stop
sudo service postgresql-11 start
cd /home/cloudera/Downloads/
pwd
wget http://jdbc.postgresql.org/download/postgresql-9.2-1002.jdbc4.jar
ls /var/lib/sqoop
sudo cp postgresql-9.2.1002.jdbc4.jar /var/lib/scoop/postgresql-0.2.1002.jdbc4.jar
ls /var/lib/sqoop
sudo cp postgresql-9.2-1002.jdbc4.jar /var/lib/scoop/postgresql-0.2.1002.jdbc4.jar
sudo cp postgresql-9.2-1002.jdbc4.jar /var/lib/scoop/postgresql-0.2-1002.jdbc4.jar
ls /var/lib/scoop
ls /var/lib/sqoop
sudo cp postgresql-9.2-1002.jdbc4.jar /var/lib/sqoop/postgresql-9.2-1002.jdbc4.jar
ls /var/lib/sqoop
sqoop list-databases --connect jdbc:postgresql://127.0.0.1/ --username postgres --password 123456
sqoop list-tables --connect jdbc:postgresql://127.0.0.1/ed --username postgres --password 123456 ----schema dimensional
sqoop list-tables --connect jdbc:postgresql://127.0.0.1/ed --username postgres --password 123456 -- --schema dimensional
sqoop import-all-tables --connect jdbc:postgresql://127.0.0.1/ed --username postgres --password 123456 -- --schema dimensional
sudo hdfs fds -ls /user/cloudera
sudo hdfs dfs -ls /user/cloudera
sudo hdfs dfs -ls /user/cloudera/fatovendas/
sudo hdfs -cat /user/cloudera/fatovendas/part-m-00000
sudo hdfs --cat /user/cloudera/fatovendas/part-m-00000
sudo hdfs dfs -cat /user/cloudera/fatovendas/part-m-00000
beeline
cd home/cloudera/Downloads
ls
cd Downloads/
ls
unzip Arquivos.zip
ls
sudo -u postgres psql
sqoop import -connect jdbc:postgresql://127.0.0.1/locadora --username postgres --password 123456 --table clientes --hive-import --create-hive-table --hive-table LOCADORA.CLIENTES;
sqoop import -connect jdbc:postgresql://127.0.0.1/locadora --username postgres --password 123456 --table despachantes --hive-import --create-hive-table --hive-table LOCADORA.DESPACHANTES;
sqoop import -connect jdbc:postgresql://127.0.0.1/locadora --username postgres --password 123456 --table veiculos --hive-import --create-hive-table --hive-table LOCADORA.VEICULOS;
sqoop import -connect jdbc:postgresql://127.0.0.1/locadora --username postgres --password 123456 --table locacao --hive-import --create-hive-table --hive-table LOCADORA.LOCACAO;
sqoop import -connect jdbc:postgresql://127.0.0.1/locadora --username postgres --password 123456 --table clientes --hive-import --create-hive-table --hive-table LOCADORA.CLIENTES;
sqoop import -connect jdbc:postgresql://127.0.0.1/locadora --username postgres --password 123456 --table despachantes --hive-import --create-hive-table --hive-table LOCADORA.DESPACHANTES;
sqoop import -connect jdbc:postgresql://127.0.0.1/locadora --username postgres --password 123456 --table veiculos --hive-import --create-hive-table --hive-table LOCADORA.VEICULOS;
mongoimport --db dbcontratos --collection contratos --file /home/cloudera/Downloads/contratos.json
mongo
pyspark
hdfs dfs -ls /user/cloudera/risco/
hdfs dfs -cat /user/cloudera/risco/part-00000
beeline
sudo apt-get install git
git
git --version
sudo apt-update gir
sudo apt-update git
update git
git --help
git help update
