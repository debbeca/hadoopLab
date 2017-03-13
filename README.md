# hadoopLab


after installing java openjdk 8 

#--------------------install openssh -------------------------------#

sudo apt-get install openssh-server -y  
/etc/init.d/ssh status  
/etc/init.d/ssh start  

 
ssh-keyscan -H localhost > ~/.ssh/known_hosts  
y|ssh-keygen -t dsa -P '' -f ~/.ssh/id_dsa  
cat ~/.ssh/id_dsa.pub > ~/.ssh/authorized_keys  
ssh-add  


#--------------------install hadoop -------------------------------#
cd /usr/local  
sudo wget http://mirror.sdunix.com/apache/hadoop/common/hadoop-2.6.0/hadoop-2.6.0.tar.gz  
tar xzf hadoop-2.6.0.tar.gz  
mkdir hadoop  
mv hadoop-2.6.0/* hadoop/ 

export HADOOP_HOME=/home/debbeca/Documents/hadoop  
export HADOOP_MAPRED_HOME=/home/debbeca/Documents/hadoop  
export HADOOP_COMMON_HOME=/home/debbeca/Documents/hadoop  
export HADOOP_HDFS_HOME=/home/debbeca/Documents/hadoop  
export YARN_HOME=/home/debbeca/Documents/hadoop  
export HADOOP_COMMON_LIB_NATIVE_DIR=/home/debbeca/Documents/hadoop/lib/native  
export JAVA_HOME=/usr/  
export JAVA_PATH=/usr/lib/jvm/java-8-openjdk-amd64
export PATH=$PATH:/home/debbeca/Documents/hadoop/sbin:/home/debbeca/Documents/hadoop/bin:$JAVA_PATH/bin 

make sure you add all those vars in hadoop-env.sh in
~/Documents/hadoop/etc/hadoop

#--------------------config hadoop -------------------------------#
/hadoop/etc/hadoop  

cat > core-site.xml << EOL  
<configuration>  
<property>  
<name>fs.default.name</name>  
<value>hdfs://localhost:9000</value>  
</property>  
</configuration>  
EOL  

cp mapred-site.xml.template mapred-site.xml  
cat > mapred-site.xml << EOL  
<configuration>  
<property>  
<name>mapreduce.framework.name</name>  
<value>yarn</value>  
</property>  
</configuration>  
EOL  

cat > yarn-site.xml << EOL  
<configuration>  
<property>  
<name>yarn.nodemanager.aux-services</name>  
<value>mapreduce_shuffle</value>  
</property>  
</configuration>  
EOL  

cat > hdfs-site.xml << EOL  
<configuration>  
<property>  
<name>dfs.replication</name>  
<value>1</value>  
</property>  
<property>  
<name>dfs.name.dir</name>  
<value>file:///home/hadoop/hadoopinfra/hdfs/namenode </value>  
</property>  
<property>  
<name>dfs.data.dir</name>  
<value>file:///home/hadoop/hadoopinfra/hdfs/datanode </value >  
</property>  
</configuration>  
EOL  

Make sure you create hadoopinfra / hdfs / namenode + datanode and point path to them
after that format


source : http://sharafjaffri.blogspot.fr/2015/04/installing-single-node-hadoop-26-using.html


