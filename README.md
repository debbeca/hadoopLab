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




source : http://sharafjaffri.blogspot.fr/2015/04/installing-single-node-hadoop-26-using.html
