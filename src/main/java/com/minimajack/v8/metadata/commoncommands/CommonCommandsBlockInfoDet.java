package com.minimajack.v8.metadata.commoncommands;

import com.minimajack.v8.annotation.V8Class;
import com.minimajack.v8.metadata.commandgroups.CommandGroupInfo;
import com.minimajack.v8.metadata.external.PatternDescription;
import com.minimajack.v8.metadata.external.common.MetadataMainInfo;
import com.minimajack.v8.metadata.external.common.V8Synonym;
import com.minimajack.v8.metadata.external.unknown.UnkIntUuid;
import com.minimajack.v8.metadata.external.unknown.CompactFlags;

@V8Class
public class CommonCommandsBlockInfoDet {

  public Integer version;
  public CommandGroupInfo cgi;
  public Integer unk1;
  public V8Synonym unk2;
  public Integer unk3;
  public CompactFlags unk4;
  public Integer unk5;
  public UnkIntUuid unk6;
  public PatternDescription pd;
  public MetadataMainInfo v8mn;
  public Integer unk7;
  public Integer unk8;
}
