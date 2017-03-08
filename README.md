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

