// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file_system_master.proto

package alluxio.grpc;

public final class FileSystemMasterProto {
  private FileSystemMasterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alluxio_grpc_FileSystemMasterCommonPOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alluxio_grpc_FileSystemMasterCommonPOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alluxio_grpc_GetStatusPOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alluxio_grpc_GetStatusPOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alluxio_grpc_GetStatusPRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alluxio_grpc_GetStatusPRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alluxio_grpc_GetStatusPResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alluxio_grpc_GetStatusPResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alluxio_grpc_FileBlockInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alluxio_grpc_FileBlockInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alluxio_grpc_FileInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alluxio_grpc_FileInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alluxio_grpc_FileSystemCommand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alluxio_grpc_FileSystemCommand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alluxio_grpc_FileSystemCommandOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alluxio_grpc_FileSystemCommandOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alluxio_grpc_PersistCommandOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alluxio_grpc_PersistCommandOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alluxio_grpc_PersistFile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alluxio_grpc_PersistFile_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030file_system_master.proto\022\014alluxio.grpc" +
      "\032\014common.proto\"U\n\036FileSystemMasterCommon" +
      "POptions\022\030\n\016syncIntervalMs\030\001 \001(\003H\000B\031\n\027op" +
      "tional_syncIntervalMs\"\223\001\n\021GetStatusPOpti" +
      "ons\0229\n\020loadMetadataType\030\001 \001(\0162\037.alluxio." +
      "grpc.LoadMetadataPType\022C\n\rcommonOptions\030" +
      "\002 \001(\0132,.alluxio.grpc.FileSystemMasterCom" +
      "monPOptions\"S\n\021GetStatusPRequest\022\014\n\004path" +
      "\030\001 \001(\t\0220\n\007options\030\002 \001(\0132\037.alluxio.grpc.G" +
      "etStatusPOptions\">\n\022GetStatusPResponse\022(" +
      "\n\010fileInfo\030\001 \001(\0132\026.alluxio.grpc.FileInfo" +
      "\"\235\001\n\rFileBlockInfo\022*\n\tblockInfo\030\001 \001(\0132\027." +
      "alluxio.grpc.BlockInfo\022\016\n\006offset\030\002 \001(\003\0224" +
      "\n\014ufsLocations\030\003 \003(\0132\036.alluxio.grpc.Work" +
      "erNetAddress\022\032\n\022ufsStringLocations\030\004 \003(\t" +
      "\"\240\004\n\010FileInfo\022\016\n\006fileId\030\001 \001(\003\022\014\n\004name\030\002 " +
      "\001(\t\022\014\n\004path\030\003 \001(\t\022\017\n\007ufsPath\030\004 \001(\t\022\016\n\006le" +
      "ngth\030\005 \001(\003\022\026\n\016blockSizeBytes\030\006 \001(\003\022\026\n\016cr" +
      "eationTimeMs\030\007 \001(\003\022\021\n\tcompleted\030\010 \001(\010\022\016\n" +
      "\006folder\030\t \001(\010\022\016\n\006pinned\030\n \001(\010\022\021\n\tcacheab" +
      "le\030\013 \001(\010\022\021\n\tpersisted\030\014 \001(\010\022\020\n\010blockIds\030" +
      "\r \003(\003\022\036\n\026lastModificationTimeMs\030\016 \001(\003\022\013\n" +
      "\003ttl\030\017 \001(\003\022\r\n\005owner\030\020 \001(\t\022\r\n\005group\030\021 \001(\t" +
      "\022\014\n\004mode\030\022 \001(\005\022\030\n\020persistenceState\030\023 \001(\t" +
      "\022\022\n\nmountPoint\030\024 \001(\010\0223\n\016fileBlockInfos\030\025" +
      " \003(\0132\033.alluxio.grpc.FileBlockInfo\022*\n\tttl" +
      "Action\030\026 \001(\0162\027.alluxio.grpc.TtlAction\022\017\n" +
      "\007mountId\030\027 \001(\003\022\033\n\023inAlluxioPercentage\030\030 " +
      "\001(\005\022\026\n\016ufsFingerprint\030\031 \001(\t\"\203\001\n\021FileSyst" +
      "emCommand\022.\n\013commandType\030\001 \001(\0162\031.alluxio" +
      ".grpc.CommandType\022>\n\016commandOptions\030\002 \001(" +
      "\0132&.alluxio.grpc.FileSystemCommandOption" +
      "s\"W\n\030FileSystemCommandOptions\022;\n\016persist" +
      "Options\030\001 \001(\0132#.alluxio.grpc.PersistComm" +
      "andOptions\"H\n\025PersistCommandOptions\022/\n\014p" +
      "ersistFiles\030\001 \003(\0132\031.alluxio.grpc.Persist" +
      "File\"/\n\013PersistFile\022\016\n\006fileId\030\001 \001(\003\022\020\n\010b" +
      "lockIds\030\002 \003(\003*4\n\021LoadMetadataPType\022\t\n\005NE" +
      "VER\020\000\022\010\n\004ONCE\020\001\022\n\n\006ALWAYS\020\0022i\n\027FileSyste" +
      "mMasterService\022N\n\tGetStatus\022\037.alluxio.gr" +
      "pc.GetStatusPRequest\032 .alluxio.grpc.GetS" +
      "tatusPResponseB\'\n\014alluxio.grpcB\025FileSyst" +
      "emMasterProtoP\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          alluxio.grpc.CommonProto.getDescriptor(),
        }, assigner);
    internal_static_alluxio_grpc_FileSystemMasterCommonPOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_alluxio_grpc_FileSystemMasterCommonPOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alluxio_grpc_FileSystemMasterCommonPOptions_descriptor,
        new java.lang.String[] { "SyncIntervalMs", "OptionalSyncIntervalMs", });
    internal_static_alluxio_grpc_GetStatusPOptions_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_alluxio_grpc_GetStatusPOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alluxio_grpc_GetStatusPOptions_descriptor,
        new java.lang.String[] { "LoadMetadataType", "CommonOptions", });
    internal_static_alluxio_grpc_GetStatusPRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_alluxio_grpc_GetStatusPRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alluxio_grpc_GetStatusPRequest_descriptor,
        new java.lang.String[] { "Path", "Options", });
    internal_static_alluxio_grpc_GetStatusPResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_alluxio_grpc_GetStatusPResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alluxio_grpc_GetStatusPResponse_descriptor,
        new java.lang.String[] { "FileInfo", });
    internal_static_alluxio_grpc_FileBlockInfo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_alluxio_grpc_FileBlockInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alluxio_grpc_FileBlockInfo_descriptor,
        new java.lang.String[] { "BlockInfo", "Offset", "UfsLocations", "UfsStringLocations", });
    internal_static_alluxio_grpc_FileInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_alluxio_grpc_FileInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alluxio_grpc_FileInfo_descriptor,
        new java.lang.String[] { "FileId", "Name", "Path", "UfsPath", "Length", "BlockSizeBytes", "CreationTimeMs", "Completed", "Folder", "Pinned", "Cacheable", "Persisted", "BlockIds", "LastModificationTimeMs", "Ttl", "Owner", "Group", "Mode", "PersistenceState", "MountPoint", "FileBlockInfos", "TtlAction", "MountId", "InAlluxioPercentage", "UfsFingerprint", });
    internal_static_alluxio_grpc_FileSystemCommand_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_alluxio_grpc_FileSystemCommand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alluxio_grpc_FileSystemCommand_descriptor,
        new java.lang.String[] { "CommandType", "CommandOptions", });
    internal_static_alluxio_grpc_FileSystemCommandOptions_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_alluxio_grpc_FileSystemCommandOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alluxio_grpc_FileSystemCommandOptions_descriptor,
        new java.lang.String[] { "PersistOptions", });
    internal_static_alluxio_grpc_PersistCommandOptions_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_alluxio_grpc_PersistCommandOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alluxio_grpc_PersistCommandOptions_descriptor,
        new java.lang.String[] { "PersistFiles", });
    internal_static_alluxio_grpc_PersistFile_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_alluxio_grpc_PersistFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alluxio_grpc_PersistFile_descriptor,
        new java.lang.String[] { "FileId", "BlockIds", });
    alluxio.grpc.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
