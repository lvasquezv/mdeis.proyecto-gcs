$script = <<-'SCRIPT'
yum -y update
yum -y install java-1.8.0-openjdk-devel
curl https://downloads.lightbend.com/scala/2.12.10/scala-2.12.10.rpm --output scala-2.12.10.rpm
yum -y install scala-2.12.10.rpm
curl https://bintray.com/sbt/rpm/rpm | tee /etc/yum.repos.d/bintray-sbt-rpm.repo
yum -y install sbt
yum install -y git
yum install -y which
yum install -y yum-utils
yum -y install rpm-build
yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo
yum install -y docker-ce docker-ce-cli containerd.io
SCRIPT

Vagrant.configure("2") do |config|
  config.vm.box = "centos/7"
  config.vm.provider "virtualbox" do |v|
    v.memory = 2048
    v.cpus = 2
    config.vm.provision "shell", inline: $script
    config.vm.network "forwarded_port", guest: 9000, host: 9000
    # config.vm.synced_folder "./", "/home/vagrant/proyecto-gcs"
  end
end

