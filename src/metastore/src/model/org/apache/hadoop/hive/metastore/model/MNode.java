package org.apache.hadoop.hive.metastore.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MNode {
  private String node_name;
  private String ips;
  public class NodeStatus {
    public static final int ONLINE = 0;
    public static final int OFFLINE = 1;
    public static final int SUSPECT = 2;
  }
  private int status;

  public MNode(String node_name, List<String> ips, int status) {
    String ipv = "";
    int idx = 0;

    for (String s : ips) {
      ipv += s;
      if (idx < ips.size() - 1) {
        ipv += ",";
      }
      idx++;
    }
    this.node_name = node_name;
    this.ips = ipv;
    this.status = status;
  }

  public String getNode_name() {
    return node_name;
  }
  public void setNode_name(String node_name) {
    this.node_name = node_name;
  }
  public String getIps() {
    return ips;
  }
  public void setIps(String ips) {
    this.ips = ips;
  }
  public void setIpList(List<String> ips) {
    String ipv = "";
    int idx = 0;

    for (String s : ips) {
      ipv += s;
      if (idx < ips.size() - 1) {
        ipv += ",";
      }
      idx++;
    }
    this.ips = ipv;
  }
  public int getStatus() {
    return status;
  }
  public void setStatus(int status) {
    this.status = status;
  }

  public List<String> getIPList() {
    return new ArrayList<String>(Arrays.asList(this.ips.split(",")));
  }
}
