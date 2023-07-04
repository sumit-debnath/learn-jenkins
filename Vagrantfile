Vagrant.configure("2") do |config|
  config.vm.provider :libvirt do |libvirt|
    libvirt.driver = "kvm"
  end

  # Define the controller node
  config.vm.define "jenkins-master" do |node|
    node.vm.box = "alvistack/ubuntu-22.04"
    node.vm.hostname = "jenkins-master"
    node.vm.network :private_network, ip: "192.168.50.2"
    node.vm.synced_folder ".", "/vagrant", disabled: true
    node.vm.provider :libvirt do |libvirt|
      libvirt.memory = 2048
      libvirt.cpus = 2
    end
  end
end
