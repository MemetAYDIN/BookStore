// kage com.example.orderbookproject.service.Token;
//
//
// ort io.jsonwebtoken.Claims;
// ort io.jsonwebtoken.Jwts;
// ort io.jsonwebtoken.SignatureAlgorithm;
// ort org.springframework.security.core.userdetails.UserDetails;
// ort org.springframework.stereotype.Service;
//
// ort java.util.Date;
// ort java.util.HashMap;
// ort java.util.Map;
// ort java.util.function.Function;
//
// rvice
// lic class JwtUtil {
//
// private String SECRET_KEY = "secret";
//
// public String extractUsername(String token) {
// return extractClaim(token, Claims::getSubject);
// }
//
// public Date extractExpiration(String token) {
// return extractClaim(token, Claims::getExpiration);
// }
//
// public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
// final Claims claims = extractAllClaims(token);
// return claimsResolver.apply(claims);
// }
// private Claims extractAllClaims(String token) {
// return
// Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
// }
//
// private Boolean isTokenExpired(String token) {
// return extractExpiration(token).before(new Date());
// }
//
// public String generateToken(UserDetails userDetails) {
// Map<String, Object> claims = new HashMap<>();
// return createToken(claims, userDetails.getUsername());
// }
//
// private String createToken(Map<String, Object> claims, String subject) {
//
// return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new
// Date(System.currentTimeMillis()))
// .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
// .signWith(SignatureAlgorithm.HS256, SECRET_KEY).compact();
// }
//
// public Boolean validateToken(String token, UserDetails userDetails) {
// final String username = extractUsername(token);
// return (username.equals(userDetails.getUsername()) &&
// !isTokenExpired(token));
// }
//
//