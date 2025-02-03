package com.cn.pojo;

public class Code {
   // 定义HTTP状态码常量，表示请求成功
public static final int OK = 200; // HTTP状态码 200 表示请求成功
// 定义HTTP状态码常量，表示服务器内部错误
public static final int ERROR = 500; // HTTP状态码 500 表示服务器内部错误
// 定义HTTP状态码常量，表示客户端请求错误
public static final int BAD_REQUEST = 400; // HTTP状态码 400 表示客户端请求错误
// 定义HTTP状态码常量，表示未授权访问
public static final int UNAUTHORIZED = 401; // HTTP状态码 401 表示未授权访问
// 定义HTTP状态码常量，表示访问被禁止
public static final int FORBIDDEN = 403; // HTTP状态码 403 表示访问被禁止
// 定义HTTP状态码常量，表示请求的资源不存在
public static final int NOT_FOUND = 404; // HTTP状态码 404 表示请求的资源不存在
// 定义HTTP状态码常量，表示请求方法不被允许
public static final int METHOD_NOT_ALLOWED = 405; // HTTP状态码 405 表示请求方法不被允许
// 定义HTTP状态码常量，表示请求的内容类型不被接受
public static final int NOT_ACCEPTABLE = 406; // HTTP状态码 406 表示请求的内容类型不被接受
// 定义HTTP状态码常量，表示请求冲突
public static final int CONFLICT = 409; // HTTP状态码 409 表示请求冲突
// 定义HTTP状态码常量，表示请求的资源已不存在
public static final int GONE = 410; // HTTP状态码 410 表示请求的资源已不存在
// 定义HTTP状态码常量，表示请求需要Content-Length头
public static final int LENGTH_REQUIRED = 411; // HTTP状态码 411 表示请求需要Content-Length头
// 定义HTTP状态码常量，表示请求的预处理条件失败
public static final int PRECONDITION_FAILED = 412; // HTTP状态码 412 表示请求的预处理条件失败
// 定义HTTP状态码常量，表示请求的实体过大
public static final int REQUEST_ENTITY_TOO_LARGE = 413; // HTTP状态码 413 表示请求的实体过大
// 定义HTTP状态码常量，表示请求的URI过长
public static final int REQUEST_URI_TOO_LONG = 414; // HTTP状态码 414 表示请求的URI过长
// 定义HTTP状态码常量，表示不支持的媒体类型
public static final int UNSUPPORTED_MEDIA_TYPE = 415; // HTTP状态码 415 表示不支持的媒体类型
// 定义HTTP状态码常量，表示请求的范围不可满足
public static final int REQUESTED_RANGE_NOT_SATISFIABLE = 416; // HTTP状态码 416 表示请求的范围不可满足
// 定义HTTP状态码常量，表示服务器无法满足请求的Expect头
public static final int EXPECTATION_FAILED = 417; // HTTP状态码 417 表示服务器无法满足请求的Expect头
// 定义HTTP状态码常量，表示服务器内部错误（重复定义）
public static final int INTERNAL_SERVER_ERROR = 500; // HTTP状态码 500 表示服务器内部错误
// 定义HTTP状态码常量，表示服务器不支持请求的方法
public static final int NOT_IMPLEMENTED = 501; // HTTP状态码 501 表示服务器不支持请求的方法
// 定义HTTP状态码常量，表示网关错误
public static final int BAD_GATEWAY = 502; // HTTP状态码 502 表示网关错误
// 定义HTTP状态码常量，表示服务不可用
public static final int SERVICE_UNAVAILABLE = 503; // HTTP状态码 503 表示服务不可用
// 定义HTTP状态码常量，表示网关超时
public static final int GATEWAY_TIMEOUT = 504; // HTTP状态码 504 表示网关超时
// 定义HTTP状态码常量，表示不支持的HTTP版本
public static final int HTTP_VERSION_NOT_SUPPORTED = 505; // HTTP状态码 505 表示不支持的HTTP版本
// 定义HTTP状态码常量，表示存储空间不足
public static final int INSUFFICIENT_STORAGE = 507; // HTTP状态码 507 表示存储空间不足
// 定义HTTP状态码常量，表示检测到循环
public static final int LOOP_DETECTED = 508; // HTTP状态码 508 表示检测到循环
// 定义HTTP状态码常量，表示带宽限制超出
public static final int BANDWIDTH_LIMIT_EXCEEDED = 509; // HTTP状态码 509 表示带宽限制超出
// 定义HTTP状态码常量，表示未扩展
public static final int NOT_EXTENDED = 510; // HTTP状态码 510 表示未扩展
// 定义HTTP状态码常量，表示需要网络身份验证
public static final int NETWORK_AUTHENTICATION_REQUIRED = 511; // HTTP状态码 511 表示需要网络身份验证
// 定义HTTP状态码常量，表示未知错误
public static final int UNKNOWN_ERROR = 520; // HTTP状态码 520 表示未知错误
// 定义HTTP状态码常量，表示Web服务器宕机
public static final int WEB_SERVER_IS_DOWN = 521; // HTTP状态码 521 表示Web服务器宕机
// 定义HTTP状态码常量，表示连接超时
public static final int CONNECTION_TIMED_OUT = 522; // HTTP状态码 522 表示连接超时
// 定义HTTP状态码常量，表示源站不可达
public static final int ORIGIN_IS_UNREACHABLE = 523; // HTTP状态码 523 表示源站不可达
// 定义HTTP状态码常量，表示超时发生
public static final int A_TIMEOUT_OCCURRED = 524; // HTTP状态码 524 表示超时发生
// 定义HTTP状态码常量，表示SSL握手失败
public static final int SSL_HANDSHAKE_FAILED = 525; // HTTP状态码 525 表示SSL握手失败
// 定义HTTP状态码常量，表示无效的SSL证书
public static final int INVALID_SSL_CERTIFICATE = 526; // HTTP状态码 526 表示无效的SSL证书
// 定义HTTP状态码常量，表示Railgun错误
public static final int RAILGUN_ERROR = 527; // HTTP状态码 527 表示Railgun错误
// 定义HTTP状态码常量，表示站点过载
public static final int SITE_IS_OVERLOADED = 529; // HTTP状态码 529 表示站点过载
// 定义HTTP状态码常量，表示站点被冻结
public static final int SITE_IS_FROZEN = 530; // HTTP状态码 530 表示站点被冻结
// 定义HTTP状态码常量，表示网络读取超时错误
public static final int NETWORK_READ_TIMEOUT_ERROR = 598; // HTTP状态码 598 表示网络读取超时错误
// 定义HTTP状态码常量，表示网络连接超时错误
public static final int NETWORK_CONNECT_TIMEOUT_ERROR = 599; // HTTP状态码 599 表示网络连接超时错误
// 定义HTTP状态码常量，表示未知状态
public static final int UNKNOWN_STATUS = 600; // HTTP状态码 600 表示未知状态
// 定义HTTP状态码常量，表示未知状态码
public static final int UNKNOWN_STATUS_CODE = 601; // HTTP状态码 601 表示未知状态码
// 定义HTTP状态码常量，表示未知状态码2
public static final int UNKNOWN_STATUS_CODE_2 = 602; // HTTP状态码 602 表示未知状态码2

// 定义自定义操作状态码常量，表示保存操作成功
public static final Integer SAVE_OK = 20011; // 自定义状态码 20011 表示保存操作成功
// 定义自定义操作状态码常量，表示删除操作成功
public static final Integer DELETE_OK = 20021; // 自定义状态码 20021 表示删除操作成功
// 定义自定义操作状态码常量，表示更新操作成功
public static final Integer UPDATE_OK = 20031; // 自定义状态码 20031 表示更新操作成功
// 定义自定义操作状态码常量，表示获取操作成功
public static final Integer GET_OK = 20041; // 自定义状态码 20041 表示获取操作成功

// 定义自定义操作状态码常量，表示保存操作失败
public static final Integer SAVE_ERR = 20010; // 自定义状态码 20010 表示保存操作失败
// 定义自定义操作状态码常量，表示删除操作失败
public static final Integer DELETE_ERR = 20020; // 自定义状态码 20020 表示删除操作失败
// 定义自定义操作状态码常量，表示更新操作失败
public static final Integer UPDATE_ERR = 20030; // 自定义状态码 20030 表示更新操作失败
// 定义自定义操作状态码常量，表示获取操作失败
public static final Integer GET_ERR = 20040; // 自定义状态码 20040 表示获取操作失败
}
