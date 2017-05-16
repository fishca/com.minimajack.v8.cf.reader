package com.minimajack.v8.metadata.inner.classes.sequences;

import com.minimajack.v8.annotation.V8Class;
import com.minimajack.v8.metadata.inner.classes.V8InnerClass;
import com.minimajack.v8.metadata.sequences.SequencesDataBlock;

import java.util.List;
import java.util.UUID;

@V8Class
public class SequencesDataList extends V8InnerClass {

  public UUID type;

  public List<SequencesDataBlock> descr;

}