package com.jmm.ind_sale_storage.core.interceptor;

//import com.xyz.dao.model.SysUser;
import lombok.Getter;
import lombok.Setter;
        import org.springframework.stereotype.Component;
        import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @Autor guoyh
 * @Date 2018/5/9 0009
 * @Usage   系统拦截器
 * @ChangeLog 201800509 添加了自动分页排序功能
 */
@Component
//@ConfigurationProperties(prefix = "system")
@Getter
@Setter
public class SystemInterceptor implements HandlerInterceptor {
//    public static final String AND = "&";
//    public static final String EQUAL = "=";
//    @Autowired
//    RedisUtil redisUtil;
//    private List<String> stopword;
//
//    private Logger logger = LoggerFactory.getLogger(this.getClass());
//
//
//
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        if (RequestMethod.GET.name().equals(request.getMethod())) {
//            return false;
//        } else if (RequestMethod.POST.name().equals(request.getMethod())) {
//            InputStream req = request.getInputStream();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(req, "UTF-8"));
//            String indexStr = "";
//            StringBuilder sb = new StringBuilder();
//            while ((indexStr = reader.readLine()) != null) {
//                sb.append(indexStr);
//            }
//            if (sb.length() > 0) {
//                Map<String, String> m = JSON.parseObject(sb.toString(), Map.class);
//                Collection<String> vals=m.values();
//                Map params = new HashMap();
//                for (String val : vals) {
//                    if (StringUtils.isEmpty(val)) {
//                        continue;
//                    }
//                    if (stopword.stream().anyMatch(item -> val.indexOf(item) >= 0)) {
//                        logger.info("请求参数包含特殊字符:" + JSON.toJSONString(m));
//                        return false;
//                    }
//                }
//
//                m.forEach((key, value) -> {
//                    if (Objects.nonNull(key) && Objects.nonNull(value)) {
//                        params.put(HtmlUtils.htmlEscape(key), HtmlUtils.htmlEscape(value));
//                    }
//                });
//                logger.info(request.getRequestURI() + " : " + JSON.toJSONString(params));
//                request.setAttribute(Constants.QUERY_PARAMS, params);
//            }
//        }else{
//            return false;
//        }
//
//        //分页排序
//        if (!this.setPagerInfo(request)){
//            return false;
//        };
//        //其它 权限==
//        this.setUserInfo(request);
//        return true;
//    }
//
//    private boolean setPagerInfo(HttpServletRequest request) {
//        Map params = (Map) request.getAttribute(Constants.QUERY_PARAMS);
//        if (Objects.isNull(params)) {
//            return true;
//        }
//        Object req_size =  params.get(PagerUtils.PAGE_SIZE);
//        Object req_num = params.get(PagerUtils.PAGE_NUMBER);
//        Object order =  params.get(PagerUtils.ORDER);
//        Object sort =  params.get(PagerUtils.SORT);
//
////        String req_num = request.getParameter(PagerUtils.PAGE_NUMBER);
////        String order = request.getParameter(PagerUtils.ORDER);
////        String sort = request.getParameter(PagerUtils.SORT);
//        int size = 0, number = 0;
//
//        if (req_size != null && req_num != null) {
//            try {
//                size = Integer.valueOf(req_size.toString());
//                number = Integer.valueOf(req_num.toString());
//            } catch (Exception e) {
//                logger.error("分页参数错误：页面大小"+req_size+"， 页码"+req_num);
//                return false;
//            }
//        }
//        boolean req_pager = size != 0 && number != 0;
//        boolean req_sort = sort != null && order != null;
//        PagerUtils pagerUtils = new PagerUtils();
//
//        if (req_pager) {//分页
//            pagerUtils.setPager(true);
//            pagerUtils.setPageSize(size);
//            pagerUtils.setPageNumber(number);
//
//        }
//        if (req_sort) {//排序
//            pagerUtils.setPager(true);
//            pagerUtils.setSort((String) sort);
//            pagerUtils.setOrder(((String) order).indexOf("asc")==0?"ASC":"DESC");
//        }
//        LocalThread.setPager(pagerUtils);
//        return true;
//    }
//
//    private void setUserInfo(HttpServletRequest request) {
//        String token = request.getHeader(Constants.REQUEST_AUTH_HEADER);
//        if (StringUtils.isEmpty(token)) {
//            return;
//        }
//        String account = JwtUtil.getClaim(token, Constants.ACCOUNT);
//        SysUser user = (SysUser) redisUtil.get(Constants.LOGIN_USER + account);
//        LocalThread.setUser(user);
//    }
}
