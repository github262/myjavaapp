// package com.example;
// // package com.example;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// @SpringBootApplication
// @RestController
// public class App {

//     @GetMapping(value = "/", produces = "text/html;charset=UTF-8")
//     public String home() {
//         return """
// <!DOCTYPE html>
// <html lang="en">
// <head>
//     <meta charset="UTF-8">
//     <meta name="viewport" content="width=device-width, initial-scale=1.0">
//     <title>Learn With Kastro | GitHub Actions + Kubernetes Masterclass</title>
//     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
//     <style>
//         * { 
//             margin: 0; 
//             padding: 0; 
//             box-sizing: border-box; 
//         }

//         :root {
//             --primary: #00ffcc;
//             --secondary: #ffcc00;
//             --accent: #6c8eff;
//             --k8s-blue: #326ce5;
//             --github-purple: #6e40c9;
//             --youtube-red: #ff0000;
//             --dark: #0b132b;
//             --darker: #080f23;
//             --light: #f0f8ff;
//             --card-bg: rgba(28, 37, 65, 0.85);
//             --transition: all 0.3s cubic-bezier(0.4, 0, 0.2, 1);
//             --gradient-1: linear-gradient(135deg, var(--primary), var(--accent));
//             --gradient-2: linear-gradient(135deg, var(--secondary), #ff8800);
//         }

//         body {
//             font-family: 'Segoe UI', system-ui, -apple-system, 'SF Pro Display', sans-serif;
//             background: radial-gradient(ellipse at top, var(--darker) 0%, var(--dark) 70%);
//             color: var(--light);
//             line-height: 1.6;
//             overflow-x: hidden;
//             min-height: 100vh;
//         }

//         /* Hero Section */
//         .hero {
//             min-height: 100vh;
//             display: flex;
//             flex-direction: column;
//             justify-content: center;
//             align-items: center;
//             text-align: center;
//             padding: 80px 20px;
//             position: relative;
//             overflow: hidden;
//         }

//         .hero-bg {
//             position: absolute;
//             top: 0;
//             left: 0;
//             width: 100%;
//             height: 100%;
//             z-index: -2;
//             opacity: 0.4;
//             background: 
//                 radial-gradient(circle at 20% 30%, rgba(50, 108, 229, 0.15) 0%, transparent 50%),
//                 radial-gradient(circle at 80% 70%, rgba(110, 64, 201, 0.15) 0%, transparent 50%);
//         }

//         .batch-announcement {
//             font-size: 1.1rem;
//             text-transform: uppercase;
//             letter-spacing: 3px;
//             color: var(--primary);
//             margin-bottom: 15px;
//             position: relative;
//             display: inline-block;
//             padding: 8px 20px;
//             border: 1px solid rgba(0, 255, 204, 0.3);
//             border-radius: 30px;
//             background: rgba(0, 255, 204, 0.05);
//             backdrop-filter: blur(5px);
//             animation: blink 2s ease-in-out infinite;
//         }

//         @keyframes blink {
//             0%, 100% { opacity: 1; }
//             50% { opacity: 0.7; }
//         }

//         .title-container {
//             margin-bottom: 30px;
//             position: relative;
//         }

//         .main-icons {
//             display: flex;
//             justify-content: center;
//             align-items: center;
//             gap: 40px;
//             margin-bottom: 40px;
//         }

//         .icon-wrapper {
//             position: relative;
//             width: 140px;
//             height: 140px;
//             display: flex;
//             align-items: center;
//             justify-content: center;
//         }

//         .icon-orb {
//             position: absolute;
//             width: 100%;
//             height: 100%;
//             border-radius: 50%;
//             background: var(--card-bg);
//             border: 2px solid;
//             backdrop-filter: blur(10px);
//             box-shadow: 0 20px 60px rgba(0, 0, 0, 0.5);
//             transition: var(--transition);
//         }

//         .github-orb {
//             border-color: var(--github-purple);
//             animation: float 6s ease-in-out infinite;
//         }

//         .k8s-orb {
//             border-color: var(--k8s-blue);
//             animation: float 6s ease-in-out infinite reverse;
//         }

//         @keyframes float {
//             0%, 100% { transform: translateY(0) rotate(0deg); }
//             50% { transform: translateY(-20px) rotate(5deg); }
//         }

//         .icon-large {
//             font-size: 5rem;
//             position: relative;
//             z-index: 2;
//         }

//         .github-icon-large {
//             color: var(--github-purple);
//             text-shadow: 0 0 30px rgba(110, 64, 201, 0.7);
//         }

//         .k8s-icon-large {
//             color: var(--k8s-blue);
//             text-shadow: 0 0 30px rgba(50, 108, 229, 0.7);
//         }

//         h1 {
//             font-size: 4rem;
//             background: linear-gradient(90deg, var(--primary), var(--accent), var(--primary));
//             -webkit-background-clip: text;
//             background-clip: text;
//             color: transparent;
//             background-size: 200% auto;
//             animation: shimmer 3s ease-in-out infinite;
//             margin: 0 0 20px 0;
//             font-weight: 800;
//             letter-spacing: -0.5px;
//         }

//         @keyframes shimmer {
//             0% { background-position: 0% center; }
//             50% { background-position: 100% center; }
//             100% { background-position: 0% center; }
//         }

//         .hero-subtitle {
//             font-size: 1.8rem;
//             font-weight: 300;
//             max-width: 800px;
//             margin: 0 auto 40px;
//             opacity: 0.9;
//             line-height: 1.5;
//         }

//         /* Batch Start Date */
//         .batch-date {
//             margin: 40px 0;
//             position: relative;
//         }

//         .date-card {
//             background: linear-gradient(135deg, rgba(50, 108, 229, 0.2), rgba(110, 64, 201, 0.2));
//             border: 1px solid rgba(255, 255, 255, 0.1);
//             border-radius: 25px;
//             padding: 30px 50px;
//             display: inline-flex;
//             align-items: center;
//             gap: 25px;
//             backdrop-filter: blur(20px);
//             box-shadow: 
//                 0 20px 60px rgba(0, 0, 0, 0.5),
//                 inset 0 1px 0 rgba(255, 255, 255, 0.1);
//             transform-style: preserve-3d;
//             perspective: 1000px;
//             animation: pulse-glow 3s ease-in-out infinite;
//         }

//         @keyframes pulse-glow {
//             0%, 100% { 
//                 box-shadow: 
//                     0 20px 60px rgba(0, 0, 0, 0.5),
//                     inset 0 1px 0 rgba(255, 255, 255, 0.1),
//                     0 0 30px rgba(255, 204, 0, 0.3);
//             }
//             50% { 
//                 box-shadow: 
//                     0 20px 60px rgba(0, 0, 0, 0.5),
//                     inset 0 1px 0 rgba(255, 255, 255, 0.1),
//                     0 0 60px rgba(255, 204, 0, 0.6);
//             }
//         }

//         .date-icon {
//             font-size: 3rem;
//             color: var(--secondary);
//         }

//         .date-content {
//             text-align: left;
//         }

//         .date-label {
//             font-size: 1.2rem;
//             opacity: 0.8;
//             margin-bottom: 5px;
//             display: block;
//         }

//         .date-main {
//             font-size: 2.8rem;
//             font-weight: 800;
//             color: var(--secondary);
//             line-height: 1;
//             text-shadow: 0 0 20px rgba(255, 204, 0, 0.5);
//         }

//         /* Main Content */
//         .container {
//             max-width: 1200px;
//             margin: 0 auto;
//             padding: 40px 20px;
//             position: relative;
//         }

//         .section {
//             margin: 100px 0;
//             opacity: 0;
//             transform: translateY(50px);
//             transition: all 0.8s cubic-bezier(0.4, 0, 0.2, 1);
//         }

//         .section.visible {
//             opacity: 1;
//             transform: translateY(0);
//         }

//         .section-title {
//             text-align: center;
//             font-size: 2.8rem;
//             margin-bottom: 60px;
//             position: relative;
//             display: inline-block;
//             left: 50%;
//             transform: translateX(-50%);
//         }

//         .section-title:before {
//             content: '';
//             position: absolute;
//             bottom: -15px;
//             left: 50%;
//             transform: translateX(-50%);
//             width: 100px;
//             height: 4px;
//             background: var(--gradient-1);
//             border-radius: 2px;
//         }

//         /* Stats */
//         .stats-grid {
//             display: grid;
//             grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
//             gap: 30px;
//             margin-top: 40px;
//         }

//         .stat-card {
//             background: var(--card-bg);
//             border-radius: 20px;
//             padding: 40px 25px;
//             text-align: center;
//             border: 1px solid rgba(255, 255, 255, 0.05);
//             transition: var(--transition);
//             position: relative;
//             overflow: hidden;
//             backdrop-filter: blur(10px);
//         }

//         .stat-card:before {
//             content: '';
//             position: absolute;
//             top: 0;
//             left: 0;
//             width: 100%;
//             height: 100%;
//             background: linear-gradient(135deg, transparent 30%, rgba(0, 255, 204, 0.05) 100%);
//             z-index: -1;
//         }

//         .stat-card:hover {
//             transform: translateY(-15px) scale(1.02);
//             border-color: rgba(0, 255, 204, 0.3);
//             box-shadow: 
//                 0 30px 60px rgba(0, 0, 0, 0.4),
//                 0 0 40px rgba(0, 255, 204, 0.1);
//         }

//         .stat-icon {
//             font-size: 3rem;
//             margin-bottom: 20px;
//             color: var(--primary);
//         }

//         .stat-number {
//             font-size: 3.5rem;
//             font-weight: 800;
//             background: var(--gradient-2);
//             -webkit-background-clip: text;
//             background-clip: text;
//             color: transparent;
//             margin: 15px 0;
//             line-height: 1;
//         }

//         /* Cards */
//         .cards-grid {
//             display: grid;
//             grid-template-columns: repeat(auto-fit, minmax(380px, 1fr));
//             gap: 40px;
//             margin-top: 40px;
//         }

//         .card {
//             background: var(--card-bg);
//             border-radius: 25px;
//             padding: 40px 35px;
//             border: 1px solid rgba(255, 255, 255, 0.05);
//             transition: var(--transition);
//             position: relative;
//             overflow: hidden;
//             backdrop-filter: blur(10px);
//         }

//         .card:before {
//             content: '';
//             position: absolute;
//             top: 0;
//             left: 0;
//             width: 6px;
//             height: 100%;
//             background: var(--gradient-1);
//         }

//         .card:hover {
//             transform: translateY(-15px);
//             border-color: rgba(0, 255, 204, 0.2);
//             box-shadow: 
//                 0 30px 60px rgba(0, 0, 0, 0.5),
//                 0 0 50px rgba(0, 255, 204, 0.1);
//         }

//         .card-header {
//             display: flex;
//             align-items: center;
//             gap: 20px;
//             margin-bottom: 30px;
//         }

//         .card-icon {
//             font-size: 3rem;
//             width: 80px;
//             height: 80px;
//             display: flex;
//             align-items: center;
//             justify-content: center;
//             border-radius: 20px;
//         }

//         .github-card .card-icon {
//             background: rgba(110, 64, 201, 0.15);
//             color: var(--github-purple);
//             animation: float 5s ease-in-out infinite;
//         }

//         .k8s-card .card-icon {
//             background: rgba(50, 108, 229, 0.15);
//             color: var(--k8s-blue);
//             animation: float 5s ease-in-out infinite reverse;
//         }

//         .card h3 {
//             font-size: 2rem;
//             color: var(--primary);
//             margin: 0;
//         }

//         .card ul {
//             list-style: none;
//             padding-left: 0;
//         }

//         .card li {
//             padding: 15px 0;
//             border-bottom: 1px solid rgba(255, 255, 255, 0.05);
//             position: relative;
//             padding-left: 35px;
//             font-size: 1.1rem;
//             transition: var(--transition);
//         }

//         .card li:before {
//             content: '▸';
//             position: absolute;
//             left: 0;
//             color: var(--secondary);
//             font-weight: bold;
//             font-size: 1.5rem;
//             transition: var(--transition);
//         }

//         .card li:hover {
//             color: var(--primary);
//             padding-left: 40px;
//         }

//         .card li:hover:before {
//             color: var(--primary);
//             transform: translateX(5px);
//         }

//         .card li:last-child {
//             border-bottom: none;
//         }

//         /* Highlighted words in the audience list */
//         .highlight {
//             color: var(--secondary);
//             font-weight: 600;
//         }

//         /* Audience Card */
//         .audience-card {
//             background: linear-gradient(135deg, rgba(50, 108, 229, 0.1), rgba(110, 64, 201, 0.1));
//             border: 1px solid rgba(255, 255, 255, 0.1);
//             max-width: 800px;
//             margin: 0 auto;
//         }

//         /* CTA */
//         .cta-section {
//             text-align: center;
//             margin: 120px 0;
//             padding: 80px 40px;
//             background: linear-gradient(135deg, rgba(28, 37, 65, 0.9), rgba(11, 19, 43, 0.9));
//             border-radius: 30px;
//             border: 1px solid rgba(0, 255, 204, 0.2);
//             position: relative;
//             overflow: hidden;
//             backdrop-filter: blur(20px);
//         }

//         .cta-section:before {
//             content: '';
//             position: absolute;
//             top: -50%;
//             left: -50%;
//             width: 200%;
//             height: 200%;
//             background: radial-gradient(circle, rgba(0, 255, 204, 0.1) 0%, transparent 70%);
//             z-index: -1;
//             animation: rotate 20s linear infinite;
//         }

//         @keyframes rotate {
//             0% { transform: rotate(0deg); }
//             100% { transform: rotate(360deg); }
//         }

//         .cta-button {
//             display: inline-flex;
//             align-items: center;
//             gap: 20px;
//             padding: 25px 60px;
//             font-size: 1.5rem;
//             font-weight: 700;
//             background: var(--gradient-2);
//             color: var(--darker);
//             border-radius: 60px;
//             text-decoration: none;
//             box-shadow: 
//                 0 20px 50px rgba(255, 204, 0, 0.4),
//                 0 0 40px rgba(255, 204, 0, 0.3);
//             transition: var(--transition);
//             margin-top: 40px;
//             position: relative;
//             overflow: hidden;
//             z-index: 1;
//         }

//         .cta-button:before {
//             content: '';
//             position: absolute;
//             top: 0;
//             left: -100%;
//             width: 100%;
//             height: 100%;
//             background: linear-gradient(90deg, transparent, rgba(255, 255, 255, 0.3), transparent);
//             transition: left 0.7s;
//             z-index: -1;
//         }

//         .cta-button:hover:before {
//             left: 100%;
//         }

//         .cta-button:hover {
//             transform: scale(1.05);
//             box-shadow: 
//                 0 30px 70px rgba(255, 204, 0, 0.6),
//                 0 0 60px rgba(255, 204, 0, 0.5);
//         }

//         /* QR Section */
//         .qr-section {
//             text-align: center;
//             margin: 80px 0;
//             padding: 50px 40px;
//             background: rgba(11, 19, 43, 0.6);
//             border-radius: 25px;
//             border: 1px solid rgba(0, 255, 204, 0.1);
//             backdrop-filter: blur(10px);
//         }

//         .qr-text {
//             display: flex;
//             align-items: center;
//             justify-content: center;
//             gap: 15px;
//             font-size: 1.3rem;
//             margin-bottom: 30px;
//             color: var(--primary);
//         }

//         .qr-container {
//             display: inline-block;
//             padding: 30px;
//             background: white;
//             border-radius: 20px;
//             box-shadow: 
//                 0 20px 50px rgba(0, 0, 0, 0.4),
//                 0 0 40px rgba(0, 255, 204, 0.2);
//             transition: var(--transition);
//         }

//         .qr-container:hover {
//             transform: translateY(-10px) scale(1.05);
//         }

//         /* Footer */
//         footer {
//             text-align: center;
//             padding: 80px 20px 40px;
//             margin-top: 100px;
//             background: linear-gradient(to top, rgba(8, 15, 35, 0.95), transparent);
//             border-top: 1px solid rgba(0, 255, 204, 0.1);
//             position: relative;
//         }

//         footer:before {
//             content: '';
//             position: absolute;
//             top: 0;
//             left: 0;
//             width: 100%;
//             height: 1px;
//             background: linear-gradient(90deg, transparent, var(--primary), transparent);
//         }

//         .footer-links {
//             display: grid;
//             grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
//             gap: 30px;
//             max-width: 1000px;
//             margin: 0 auto 50px;
//         }

//         .contact-card {
//             background: var(--card-bg);
//             padding: 30px 20px;
//             border-radius: 20px;
//             border: 1px solid rgba(255, 255, 255, 0.05);
//             transition: var(--transition);
//             backdrop-filter: blur(10px);
//         }

//         .contact-card:hover {
//             transform: translateY(-10px);
//             border-color: rgba(0, 255, 204, 0.2);
//             box-shadow: 0 20px 40px rgba(0, 0, 0, 0.3);
//         }

//         .youtube-card:hover {
//             border-color: rgba(255, 0, 0, 0.3);
//             box-shadow: 0 20px 40px rgba(255, 0, 0, 0.2);
//         }

//         .contact-icon {
//             font-size: 2.5rem;
//             margin-bottom: 20px;
//         }

//         .email-icon {
//             color: var(--primary);
//         }

//         .phone-icon {
//             color: var(--secondary);
//         }

//         .website-icon {
//             color: var(--accent);
//         }

//         .youtube-icon {
//             color: var(--youtube-red);
//         }

//         .contact-title {
//             font-size: 1.3rem;
//             margin-bottom: 15px;
//             color: var(--light);
//             font-weight: 600;
//         }

//         .contact-info {
//             font-size: 1rem;
//             opacity: 0.9;
//             line-height: 1.5;
//         }

//         .contact-link {
//             color: var(--primary);
//             text-decoration: none;
//             transition: var(--transition);
//             word-break: break-word;
//         }

//         .contact-link:hover {
//             color: var(--secondary);
//             text-decoration: underline;
//         }

//         .youtube-link:hover {
//             color: var(--youtube-red);
//         }

//         .copyright {
//             opacity: 0.7;
//             font-size: 0.9rem;
//             margin-top: 50px;
//             padding-top: 30px;
//             border-top: 1px solid rgba(255, 255, 255, 0.1);
//         }

//         /* Responsive */
//         @media (max-width: 992px) {
//             h1 { font-size: 3rem; }
//             .hero-subtitle { font-size: 1.5rem; }
//             .main-icons { gap: 20px; }
//             .icon-wrapper { width: 100px; height: 100px; }
//             .icon-large { font-size: 3.5rem; }
//             .date-main { font-size: 2.2rem; }
//             .cards-grid { grid-template-columns: 1fr; }
//             .footer-links { grid-template-columns: repeat(2, 1fr); }
//         }

//         @media (max-width: 768px) {
//             h1 { font-size: 2.5rem; }
//             .hero { padding: 60px 20px; }
//             .icon-wrapper { width: 80px; height: 80px; }
//             .icon-large { font-size: 2.8rem; }
//             .date-card { padding: 20px 30px; flex-direction: column; text-align: center; }
//             .date-main { font-size: 2rem; }
//             .section-title { font-size: 2.2rem; }
//             .cta-button { padding: 20px 40px; font-size: 1.3rem; }
//             .stat-number { font-size: 2.8rem; }
//             .footer-links { grid-template-columns: 1fr; }
//             .batch-announcement { font-size: 0.9rem; letter-spacing: 2px; padding: 6px 15px; }
//         }
//     </style>
// </head>
// <body>
//     <!-- Hero Section -->
//     <section class="hero">
//         <div class="hero-bg"></div>
        
//         <!-- Announcement Badge -->
//         <div class="batch-announcement">
//             🎉 Announcing New Batch
//         </div>
        
//         <div class="main-icons">
//             <div class="icon-wrapper">
//                 <div class="icon-orb github-orb"></div>
//                 <i class="fab fa-github-alt icon-large github-icon-large"></i>
//             </div>
//             <div class="icon-wrapper">
//                 <div class="icon-orb k8s-orb"></div>
//                 <i class="fab fa-docker icon-large k8s-icon-large"></i>
//             </div>
//         </div>
        
//         <div class="title-container">
//             <h1>GitHub Actions + Kubernetes</h1>
//         </div>
        
//         <p class="hero-subtitle">
//             Master Industry-Grade CI/CD Pipelines & Cloud-Native Deployments
//         </p>

//         <!-- Batch Start Date -->
//         <div class="batch-date">
//             <div class="date-card">
//                 <div class="date-icon">
//                     <i class="fas fa-calendar-alt"></i>
//                 </div>
//                 <div class="date-content">
//                     <span class="date-label">🚀 Next Batch Starts</span>
//                     <div class="date-main">Coming Soon</div>
//                 </div>
//             </div>
//         </div>
//     </section>

//     <div class="container">
//         <!-- Training Highlights -->
//         <section class="section" id="highlights">
//             <h2 class="section-title">⭐ Training Highlights</h2>
//             <div class="stats-grid">
//                 <div class="stat-card">
//                     <div class="stat-icon"><i class="fas fa-calendar-check"></i></div>
//                     <div class="stat-number">35-40</div>
//                     <p>Days Live Training</p>
//                 </div>
//                 <div class="stat-card">
//                     <div class="stat-icon"><i class="fas fa-tools"></i></div>
//                     <div class="stat-number">5+</div>
//                     <p>Major Tools Covered</p>
//                 </div>
//                 <div class="stat-card">
//                     <div class="stat-icon"><i class="fas fa-project-diagram"></i></div>
//                     <div class="stat-number">5</div>
//                     <p>Hands-on Projects</p>
//                 </div>
//                 <div class="stat-card">
//                     <div class="stat-icon"><i class="fas fa-trophy"></i></div>
//                     <div class="stat-number">2</div>
//                     <p>Capstone Projects</p>
//                 </div>
//             </div>
//         </section>

//         <!-- Curriculum -->
//         <section class="section" id="curriculum">
//             <h2 class="section-title">📚 Curriculum Overview</h2>
//             <div class="cards-grid">
//                 <div class="card github-card">
//                     <div class="card-header">
//                         <div class="card-icon">
//                             <i class="fab fa-github"></i>
//                         </div>
//                         <h3>GitHub Actions Mastery</h3>
//                     </div>
//                     <ul>
//                         <li>Complete CI/CD Pipeline Design</li>
//                         <li>Hosted & Self-Hosted Runners</li>
//                         <li>Advanced Security & Secrets Management</li>
//                         <li>Docker Image Build & Push Pipelines</li>
//                         <li>Multi-Stage & Matrix Workflows</li>
//                         <li>Automated Versioning & Releases</li>
//                         <li>Custom GitHub Actions Development</li>
//                         <li>Enterprise Best Practices</li>
//                     </ul>
//                 </div>
                
//                 <div class="card k8s-card">
//                     <div class="card-header">
//                         <div class="card-icon">
//                             <i class="fab fa-docker"></i>
//                         </div>
//                         <h3>Kubernetes Mastery</h3>
//                     </div>
//                     <ul>
//                         <li>Kubernetes Architecture Deep Dive</li>
//                         <li>Pods, Deployments & Services</li>
//                         <li>Advanced Networking & Ingress</li>
//                         <li>Helm Charts & Package Management</li>
//                         <li>AWS EKS Deployment & Management</li>
//                         <li>GitOps with ArgoCD</li>
//                         <li>Monitoring with Prometheus & Grafana</li>
//                         <li>Service Mesh with Istio</li>
//                         <li>Production Security & RBAC</li>
//                     </ul>
//                 </div>
//             </div>
//         </section>

//         <!-- Audience -->
//         <section class="section" id="audience">
//             <h2 class="section-title">🎯 Perfect For</h2>
//             <div class="card audience-card">
//                 <div class="card-header">
//                     <div class="card-icon">
//                         <i class="fas fa-users"></i>
//                     </div>
//                     <h3>Who Should Join This Training?</h3>
//                 </div>
//                 <ul>
//                     <li><span class="highlight">DevOps Engineers</span> looking to master cloud-native technologies</li>
//                     <li><span class="highlight">Software Developers</span> transitioning to DevOps roles</li>
//                     <li><span class="highlight">System Administrators</span> upgrading to container orchestration</li>
//                     <li><span class="highlight">Cloud Engineers</span> specializing in Kubernetes</li>
//                     <li><span class="highlight">Freshers & Students</span> aiming for high-growth DevOps careers</li>
//                     <li><span class="highlight">IT Professionals</span> preparing for production deployments</li>
//                 </ul>
//             </div>
//         </section>

//         <!-- CTA -->
//         <section class="cta-section">
//             <h2 style="font-size: 3rem; margin-bottom: 30px; color: var(--secondary);">
//                 🚀 Ready to Accelerate Your Career?
//             </h2>
//             <p style="font-size: 1.4rem; max-width: 800px; margin: 0 auto 40px; opacity: 0.95; line-height: 1.6;">
//                 Join the most comprehensive GitHub Actions & Kubernetes training program. 
//                 Transform your skills with hands-on projects and industry-relevant curriculum.
//             </p>
//             <a href="https://forms.gle/D5dib9DFsfSN4Koy7" target="_blank" class="cta-button">
//                 <i class="fas fa-rocket"></i>
//                 Reserve Your Seat Now
//             </a>
//         </section>

//         <!-- QR -->
//         <section class="qr-section">
//             <div class="qr-text">
//                 <i class="fas fa-qrcode"></i>
//                 <span>Scan to Register Instantly</span>
//             </div>
//             <div class="qr-container">
//                 <img src="https://api.qrserver.com/v1/create-qr-code/?size=220x220&data=https://forms.gle/D5dib9DFsfSN4Koy7&format=svg&color=0b132b&bgcolor=ffffff&qzone=2" 
//                      alt="Registration QR Code"
//                      style="width: 220px; height: 220px;">
//             </div>
//         </section>
//     </div>

//     <footer>
//         <div class="footer-links">
//             <div class="contact-card">
//                 <div class="contact-icon email-icon">
//                     <i class="fas fa-envelope"></i>
//                 </div>
//                 <div class="contact-title">Email Us</div>
//                 <div class="contact-info">
//                     <a href="mailto:learnwithkastro@gmail.com" class="contact-link">
//                         learnwithkastro@gmail.com
//                     </a>
//                 </div>
//             </div>
            
//             <div class="contact-card">
//                 <div class="contact-icon phone-icon">
//                     <i class="fas fa-phone"></i>
//                 </div>
//                 <div class="contact-title">Call Us</div>
//                 <div class="contact-info">
//                     <a href="tel:+919700712459" class="contact-link">
//                         +91 97007 12459
//                     </a>
//                 </div>
//             </div>
            
//             <div class="contact-card">
//                 <div class="contact-icon website-icon">
//                     <i class="fas fa-globe"></i>
//                 </div>
//                 <div class="contact-title">Website</div>
//                 <div class="contact-info">
//                     <a href="https://www.learnwithkastro.com" target="_blank" class="contact-link">
//                         www.learnwithkastro.com
//                     </a>
//                 </div>
//             </div>
            
//             <div class="contact-card youtube-card">
//                 <div class="contact-icon youtube-icon">
//                     <i class="fab fa-youtube"></i>
//                 </div>
//                 <div class="contact-title">YouTube Channel</div>
//                 <div class="contact-info">
//                     <a href="https://www.youtube.com/@LearnWithKASTRO" target="_blank" class="contact-link youtube-link">
//                         @LearnWithKASTRO
//                     </a>
//                     <div style="margin-top: 10px; font-size: 0.9rem; opacity: 0.8;">
//                         Watch tutorials & demos
//                     </div>
//                 </div>
//             </div>
//         </div>
        
//         <div class="copyright">
//             <p>© 2026 Learn With Kastro. All rights reserved.</p>
//             <p style="margin-top: 10px; font-size: 0.95rem;">
//                 Transform Your DevOps Career with Expert-Led Training
//             </p>
//         </div>
//     </footer>

//     <script>
//         // Scroll animations
//         document.addEventListener('DOMContentLoaded', function() {
//             const sections = document.querySelectorAll('.section');
            
//             const observer = new IntersectionObserver((entries) => {
//                 entries.forEach(entry => {
//                     if (entry.isIntersecting) {
//                         entry.target.classList.add('visible');
//                     }
//                 });
//             }, {
//                 threshold: 0.1,
//                 rootMargin: '0px 0px -100px 0px'
//             });
            
//             sections.forEach(section => {
//                 observer.observe(section);
//             });

//             // Create floating particles
//             const heroBg = document.querySelector('.hero-bg');
//             for (let i = 0; i < 15; i++) {
//                 const particle = document.createElement('div');
//                 particle.style.position = 'absolute';
//                 particle.style.width = Math.random() * 5 + 2 + 'px';
//                 particle.style.height = particle.style.width;
//                 particle.style.background = Math.random() > 0.5 ? 'rgba(0, 255, 204, 0.2)' : 'rgba(255, 204, 0, 0.2)';
//                 particle.style.borderRadius = '50%';
//                 particle.style.left = Math.random() * 100 + '%';
//                 particle.style.top = Math.random() * 100 + '%';
//                 particle.style.animation = `float ${Math.random() * 10 + 10}s ease-in-out infinite`;
//                 particle.style.animationDelay = Math.random() * 5 + 's';
//                 heroBg.appendChild(particle);
//             }
//         });
//     </script>
// </body>
// </html>
//         """;
//     }

//     public static void main(String[] args) {
//         SpringApplication.run(App.class, args);
//     }
// }


package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    @GetMapping(value = "/", produces = "text/html;charset=UTF-8")
    public String home() {
        return """
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Farman Ullah - Systems Administrator focused on cloud infrastructure, AWS, DevOps, automation, and IT operations.">
    <meta name="theme-color" content="#0b1020">
    <title>Farman Ullah | Systems Administrator & Cloud Enthusiast</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=DM+Mono:wght@400;500&family=Manrope:wght@400;500;600;700;800&display=swap" rel="stylesheet">
    <style>
        :root {
            --bg: #0b1020;
            --bg-soft: #10182c;
            --panel: rgba(19, 29, 51, .78);
            --panel-solid: #131d33;
            --text: #edf3ff;
            --muted: #9aa9c2;
            --line: rgba(170, 195, 235, .14);
            --cyan: #63e6df;
            --blue: #78a8ff;
            --purple: #ad96ff;
            --radius: 20px;
            --max: 1120px;
        }

        * { box-sizing: border-box; margin: 0; padding: 0; }
        html { scroll-behavior: smooth; scroll-padding-top: 86px; }
        body {
            background:
                radial-gradient(circle at 82% 8%, rgba(93, 113, 255, .14), transparent 28rem),
                radial-gradient(circle at 5% 35%, rgba(40, 215, 204, .09), transparent 25rem),
                var(--bg);
            color: var(--text);
            font-family: "Manrope", system-ui, sans-serif;
            line-height: 1.7;
            overflow-x: hidden;
        }
        a { color: inherit; text-decoration: none; }
        button { font: inherit; }
        .wrap { width: min(var(--max), calc(100% - 44px)); margin-inline: auto; }
        .mono { font-family: "DM Mono", monospace; }
        .muted { color: var(--muted); }
        .eyebrow {
            display: inline-flex; align-items: center; gap: 10px;
            color: var(--cyan); font: 500 .76rem "DM Mono", monospace;
            letter-spacing: .13em; text-transform: uppercase;
        }
        .eyebrow::before { content: ""; width: 24px; height: 1px; background: var(--cyan); }
        .section { padding: 104px 0; }
        .section-head { max-width: 680px; margin-bottom: 42px; }
        .section-head h2 { font-size: clamp(2rem, 4vw, 3rem); line-height: 1.15; letter-spacing: -.055em; margin: 15px 0; }
        .section-head p { color: var(--muted); max-width: 620px; }
        .gradient-text {
            background: linear-gradient(100deg, var(--cyan), var(--blue) 55%, var(--purple));
            -webkit-background-clip: text; background-clip: text; color: transparent;
        }

        /* Navigation */
        .nav-shell {
            position: sticky; top: 0; z-index: 20;
            background: rgba(11, 16, 32, .78); backdrop-filter: blur(18px);
            border-bottom: 1px solid var(--line);
        }
        nav { min-height: 76px; display: flex; align-items: center; justify-content: space-between; gap: 24px; }
        .brand { font-size: 1rem; font-weight: 800; letter-spacing: -.04em; }
        .brand span { color: var(--cyan); }
        .nav-links { display: flex; align-items: center; gap: 27px; list-style: none; }
        .nav-links a { color: var(--muted); font-size: .84rem; font-weight: 700; transition: color .2s; }
        .nav-links a:hover, .nav-links a.active { color: var(--cyan); }
        .nav-cta {
            border: 1px solid rgba(99, 230, 223, .42); color: var(--cyan);
            border-radius: 999px; padding: 10px 17px; font-size: .8rem; font-weight: 800;
            transition: .2s;
        }
        .nav-cta:hover { background: rgba(99, 230, 223, .1); transform: translateY(-2px); }
        .menu-toggle { display: none; color: var(--text); background: none; border: 0; font-size: 1.5rem; cursor: pointer; }

        /* Hero */
        .hero { min-height: 690px; display: grid; align-items: center; padding: 92px 0 100px; position: relative; }
        .hero-grid { display: grid; grid-template-columns: 1.3fr .7fr; align-items: center; gap: 70px; }
        .availability {
            display: inline-flex; align-items: center; gap: 9px; padding: 8px 13px;
            border: 1px solid var(--line); background: rgba(19, 29, 51, .55);
            border-radius: 999px; color: #c5d2e8; font: .72rem "DM Mono", monospace;
            margin-bottom: 27px;
        }
        .dot { width: 7px; height: 7px; background: #6de6a5; border-radius: 50%; box-shadow: 0 0 14px #6de6a5; }
        .hero h1 { font-size: clamp(3rem, 6.6vw, 5.6rem); line-height: 1.02; letter-spacing: -.075em; max-width: 760px; }
        .hero h1 .line { display: block; }
        .hero-copy { max-width: 650px; color: var(--muted); font-size: 1.04rem; margin: 25px 0 32px; }
        .hero-actions { display: flex; flex-wrap: wrap; gap: 13px; }
        .btn {
            display: inline-flex; align-items: center; justify-content: center; gap: 10px;
            border-radius: 10px; padding: 13px 19px; font-size: .85rem; font-weight: 800;
            border: 1px solid transparent; transition: transform .2s, background .2s, border-color .2s;
        }
        .btn:hover { transform: translateY(-3px); }
        .btn-primary { background: var(--cyan); color: #07151b; box-shadow: 0 9px 35px rgba(99, 230, 223, .16); }
        .btn-secondary { border-color: var(--line); color: var(--text); background: rgba(19, 29, 51, .5); }
        .btn-secondary:hover { border-color: rgba(99, 230, 223, .5); }
        .hero-meta { display: flex; gap: 24px; flex-wrap: wrap; margin-top: 42px; color: var(--muted); font: .72rem "DM Mono", monospace; }
        .hero-meta span { display: inline-flex; align-items: center; gap: 8px; }
        .hero-meta b { color: var(--cyan); font-weight: 400; }

        .visual { position: relative; min-height: 390px; display: grid; place-items: center; }
        .orbit { width: min(330px, 80vw); aspect-ratio: 1; border: 1px solid rgba(120, 168, 255, .22); border-radius: 50%; position: absolute; }
        .orbit::before, .orbit::after { content: ""; position: absolute; border: 1px solid rgba(99, 230, 223, .18); border-radius: 50%; inset: 28px; }
        .orbit::after { inset: 62px; border-color: rgba(173, 150, 255, .2); }
        .core {
            width: 168px; height: 168px; display: grid; place-items: center; text-align: center;
            border-radius: 35px; transform: rotate(-8deg);
            background: linear-gradient(145deg, rgba(99, 230, 223, .18), rgba(120, 168, 255, .12));
            border: 1px solid rgba(99, 230, 223, .45);
            box-shadow: 0 0 80px rgba(99, 230, 223, .12), inset 0 0 35px rgba(99, 230, 223, .07);
        }
        .core-inner { transform: rotate(8deg); }
        .core strong { display: block; font-size: 2.5rem; letter-spacing: -.08em; }
        .core small { color: var(--cyan); font: .65rem "DM Mono", monospace; letter-spacing: .12em; }
        .float-tag {
            position: absolute; padding: 10px 13px; border: 1px solid var(--line);
            border-radius: 10px; background: rgba(16, 24, 44, .9); color: #cbd7eb;
            font: .72rem "DM Mono", monospace; box-shadow: 0 12px 35px rgba(0,0,0,.2);
        }
        .tag-a { top: 42px; left: 0; } .tag-b { top: 104px; right: -12px; }
        .tag-c { bottom: 55px; left: -5px; } .tag-d { bottom: 17px; right: 10px; }

        /* Quick facts */
        .quick-strip { border-block: 1px solid var(--line); background: rgba(16, 24, 44, .48); }
        .quick-grid { display: grid; grid-template-columns: repeat(4, 1fr); }
        .quick-item { padding: 25px 20px; border-right: 1px solid var(--line); }
        .quick-item:last-child { border-right: 0; }
        .quick-item strong { display: block; font-size: .94rem; margin-bottom: 4px; }
        .quick-item span { color: var(--muted); font: .68rem "DM Mono", monospace; }

        /* About */
        .about-grid { display: grid; grid-template-columns: .85fr 1.15fr; gap: 70px; align-items: start; }
        .about-card {
            border: 1px solid var(--line); background: linear-gradient(145deg, rgba(25, 39, 66, .8), rgba(15, 23, 42, .75));
            border-radius: var(--radius); padding: 28px; position: relative; overflow: hidden;
        }
        .about-card::after { content: "</>"; position: absolute; right: 20px; bottom: -35px; color: rgba(99,230,223,.07); font: 800 8rem "DM Mono", monospace; }
        .about-card .code-label { color: var(--cyan); font: .7rem "DM Mono", monospace; }
        .about-card h3 { font-size: 1.5rem; margin: 24px 0 10px; letter-spacing: -.04em; }
        .about-card p { color: var(--muted); font-size: .9rem; }
        .about-copy p { color: var(--muted); margin: 0 0 17px; }
        .about-copy strong { color: var(--text); }
        .focus-list { display: flex; flex-wrap: wrap; gap: 9px; margin-top: 25px; }
        .chip { border: 1px solid var(--line); border-radius: 999px; padding: 7px 11px; color: #c8d5e9; font: .68rem "DM Mono", monospace; background: rgba(19,29,51,.5); }

        /* Skills */
        .skills-grid { display: grid; grid-template-columns: repeat(3, 1fr); gap: 17px; }
        .skill-card { padding: 25px; border: 1px solid var(--line); background: var(--panel); border-radius: 16px; transition: .25s; }
        .skill-card:hover { transform: translateY(-5px); border-color: rgba(99,230,223,.38); }
        .skill-icon { width: 42px; height: 42px; display: grid; place-items: center; border-radius: 12px; color: var(--cyan); background: rgba(99,230,223,.1); font: 1rem "DM Mono", monospace; margin-bottom: 18px; }
        .skill-card h3 { font-size: 1rem; margin-bottom: 9px; }
        .skill-card p { color: var(--muted); font-size: .82rem; }
        .skill-tags { display: flex; flex-wrap: wrap; gap: 7px; margin-top: 16px; }
        .skill-tags span { color: #b6c4db; font: .64rem "DM Mono", monospace; background: rgba(255,255,255,.045); padding: 5px 7px; border-radius: 5px; }

        /* Projects */
        .projects { background: linear-gradient(180deg, transparent, rgba(16,24,44,.55), transparent); }
        .project-grid { display: grid; grid-template-columns: repeat(2, 1fr); gap: 18px; }
        .project-card {
            border: 1px solid var(--line); background: var(--panel); border-radius: 17px;
            padding: 27px; min-height: 260px; display: flex; flex-direction: column; transition: .25s;
        }
        .project-card:hover { transform: translateY(-5px); border-color: rgba(120,168,255,.42); }
        .project-top { display: flex; justify-content: space-between; align-items: center; margin-bottom: 23px; }
        .project-type { color: var(--cyan); font: .67rem "DM Mono", monospace; text-transform: uppercase; letter-spacing: .1em; }
        .project-number { color: #63728e; font: .8rem "DM Mono", monospace; }
        .project-card h3 { font-size: 1.2rem; margin-bottom: 10px; letter-spacing: -.035em; }
        .project-card p { color: var(--muted); font-size: .84rem; flex: 1; }
        .project-stack { display: flex; flex-wrap: wrap; gap: 8px; margin-top: 22px; }
        .project-stack span { color: #c1d0e8; font: .65rem "DM Mono", monospace; }
        .project-stack span:not(:last-child)::after { content: " /"; color: var(--cyan); margin-left: 8px; }

        /* Approach */
        .approach-grid { display: grid; grid-template-columns: repeat(3, 1fr); gap: 18px; }
        .approach-card { padding: 24px; border-top: 1px solid rgba(99,230,223,.5); background: rgba(19,29,51,.5); border-radius: 0 0 14px 14px; }
        .approach-card .num { color: var(--cyan); font: .75rem "DM Mono", monospace; }
        .approach-card h3 { margin: 15px 0 8px; font-size: 1rem; }
        .approach-card p { color: var(--muted); font-size: .82rem; }

        /* Contact */
        .contact-panel {
            border: 1px solid rgba(99,230,223,.25); border-radius: 22px; padding: clamp(28px, 6vw, 60px);
            background: radial-gradient(circle at 100% 0, rgba(120,168,255,.13), transparent 22rem), var(--panel);
            display: flex; align-items: center; justify-content: space-between; gap: 30px;
        }
        .contact-panel h2 { font-size: clamp(2rem, 4vw, 3rem); letter-spacing: -.06em; line-height: 1.1; margin: 13px 0; }
        .contact-panel p { color: var(--muted); max-width: 560px; }
        .contact-actions { display: flex; flex-wrap: wrap; gap: 10px; margin-top: 25px; }
        .contact-side { min-width: 190px; text-align: right; }
        .contact-side span { display: block; color: var(--muted); font: .68rem "DM Mono", monospace; margin-bottom: 8px; }
        .contact-side a { color: var(--cyan); font-size: .9rem; font-weight: 700; overflow-wrap: anywhere; }

        footer { padding: 30px 0 40px; border-top: 1px solid var(--line); color: var(--muted); font-size: .75rem; }
        .footer-inner { display: flex; justify-content: space-between; align-items: center; gap: 15px; }
        .back-top { color: var(--cyan); font-family: "DM Mono", monospace; }
        .reveal { opacity: 0; transform: translateY(22px); transition: opacity .7s ease, transform .7s ease; }
        .reveal.visible { opacity: 1; transform: translateY(0); }

        @media (max-width: 900px) {
            .hero-grid { grid-template-columns: 1fr .7fr; gap: 25px; }
            .about-grid { gap: 35px; }
            .skills-grid { grid-template-columns: repeat(2, 1fr); }
            .contact-panel { align-items: flex-start; flex-direction: column; }
            .contact-side { text-align: left; }
        }
        @media (max-width: 700px) {
            .wrap { width: min(100% - 32px, var(--max)); }
            nav { min-height: 68px; }
            .menu-toggle { display: block; }
            .nav-cta { display: none; }
            .nav-links {
                display: none; position: absolute; top: 68px; left: 0; right: 0;
                padding: 18px 24px 24px; background: #10182c; border-bottom: 1px solid var(--line);
                flex-direction: column; align-items: flex-start; gap: 17px;
            }
            .nav-links.open { display: flex; }
            .hero { min-height: auto; padding: 76px 0 65px; }
            .hero-grid { grid-template-columns: 1fr; }
            .hero h1 { font-size: clamp(3rem, 14vw, 4.6rem); }
            .visual { min-height: 300px; margin-top: 10px; }
            .orbit { width: 270px; }
            .core { width: 140px; height: 140px; }
            .tag-a { left: 4%; } .tag-b { right: 2%; }
            .tag-c { left: 2%; } .tag-d { right: 4%; }
            .quick-grid { grid-template-columns: repeat(2, 1fr); }
            .quick-item:nth-child(2) { border-right: 0; }
            .quick-item:nth-child(-n+2) { border-bottom: 1px solid var(--line); }
            .section { padding: 75px 0; }
            .about-grid, .project-grid, .approach-grid { grid-template-columns: 1fr; }
            .skills-grid { grid-template-columns: 1fr; }
            .footer-inner { flex-direction: column; align-items: flex-start; }
        }
        @media (prefers-reduced-motion: reduce) {
            *, *::before, *::after { scroll-behavior: auto !important; transition-duration: .01ms !important; animation-duration: .01ms !important; }
            .reveal { opacity: 1; transform: none; }
        }
    </style>
</head>
<body>
    <div class="nav-shell">
        <nav class="wrap" aria-label="Main navigation">
            <a class="brand" href="#home">FARMAN<span>.</span></a>
            <button class="menu-toggle" id="menuToggle" aria-label="Open navigation" aria-expanded="false">☰</button>
            <ul class="nav-links" id="navLinks">
                <li><a href="#about">About</a></li>
                <li><a href="#skills">Skills</a></li>
                <li><a href="#projects">Projects</a></li>
                <li><a href="#approach">Approach</a></li>
                <li><a href="#contact">Contact</a></li>
            </ul>
            <a class="nav-cta" href="#contact">Let's connect ↗</a>
        </nav>
    </div>

    <main>
        <section class="hero" id="home">
            <div class="wrap hero-grid">
                <div>
                    <div class="availability"><span class="dot"></span> SYSTEMS ADMINISTRATION · CLOUD · DEVOPS</div>
                    <h1>Building reliable<br><span class="gradient-text">IT & cloud</span><br>infrastructure.</h1>
                    <p class="hero-copy">I'm Farman Ullah, a Systems Administrator with a hands-on interest in AWS cloud, DevOps automation, infrastructure security, and dependable IT operations. I enjoy turning complex technical challenges into practical, maintainable solutions.</p>
                    <div class="hero-actions">
                        <a class="btn btn-primary" href="#projects">Explore my work <span>↘</span></a>
                        <a class="btn btn-secondary" href="#contact">Get in touch <span>↗</span></a>
                    </div>
                    <div class="hero-meta">
                        <span><b>⌁</b> Infrastructure & operations</span>
                        <span><b>⌁</b> AWS hands-on projects</span>
                        <span><b>⌁</b> Automation mindset</span>
                    </div>
                </div>
                <div class="visual" aria-label="Abstract cloud and infrastructure illustration">
                    <div class="orbit"></div>
                    <div class="core"><div class="core-inner"><strong>FU</strong><small>IT / CLOUD / DevOps</small></div></div>
                    <div class="float-tag tag-a">AWS / EC2</div>
                    <div class="float-tag tag-b">Windows Server</div>
                    <div class="float-tag tag-c">CI / CD</div>
                    <div class="float-tag tag-d">Networking</div>

                </div>
                <div class="visual" aria-label="Abstract DevOps, Security, Linux and IT Operations illustration">
                    <div class="orbit"></div>
                    <div class="float-tag tag-a">FortiGate Administration</div>
                    <div class="float-tag tag-b">Security</div>
                    <div class="float-tag tag-c">Linux Administration</div>
                    <div class="float-tag tag-d">Office 365 Administration</div>
                    <div class="float-tag tag-d">Web Development and Designing</div>
                </div>
            </div>
        </section>

        <div class="quick-strip">
            <div class="wrap quick-grid">
                <div class="quick-item"><strong>Systems Administration</strong><span>CORE FOCUS</span></div>
                <div class="quick-item"><strong>AWS Cloud</strong><span>HANDS-ON LEARNING</span></div>
                <div class="quick-item"><strong>DevOps & CI/CD</strong><span>AUTOMATION</span></div>
                <div class="quick-item"><strong>IT Security</strong><span>OPERATIONAL RESILIENCE</span></div>
            </div>
        </div>

        <section class="section" id="about">
            <div class="wrap about-grid">
                <div class="section-head reveal">
                    <span class="eyebrow">01 / About me</span>
                    <h2>Technology should work <span class="gradient-text">quietly and reliably.</span></h2>
                    <div class="about-card">
                        <span class="code-label">PROFILE.SYS</span>
                        <h3>Systems Administrator</h3>
                        <p>Focused on keeping business technology secure, available, and ready to scale — from on-premises infrastructure to cloud-based environments.</p>
                    </div>
                </div>
                <div class="about-copy reveal">
                    <p>I work across the practical foundations of IT: <strong>server administration, identity and access, networking, endpoint management, and security tooling.</strong> My approach is to understand the problem, make changes carefully, document the result, and verify that the solution works.</p>
                    <p>Alongside infrastructure operations, I'm building deeper cloud and DevOps capability through hands-on projects with AWS, Docker, Kubernetes, Maven, and GitHub Actions. I enjoy learning by building, testing, troubleshooting, and improving real deployment workflows.</p>
                    <p>I'm particularly interested in infrastructure automation, secure cloud architecture, CI/CD, and improving the reliability of IT services.</p>
                    <div class="focus-list">
                        <span class="chip">Problem solving</span><span class="chip">Documentation</span>
                        <span class="chip">Troubleshooting</span><span class="chip">Security minded</span>
                        <span class="chip">Continuous learning</span>
                    </div>
                </div>
            </div>
        </section>

        <section class="section" id="skills">
            <div class="wrap">
                <div class="section-head reveal">
                    <span class="eyebrow">02 / Technical toolkit</span>
                    <h2>Tools I use to <span class="gradient-text">get things done.</span></h2>
                    <p>A practical mix of enterprise IT administration and growing cloud-native engineering skills.</p>
                </div>
                <div class="skills-grid">
                    <article class="skill-card reveal">
                        <div class="skill-icon">01</div><h3>Systems & Identity</h3>
                        <p>Managing core Windows infrastructure, directory services, and user access.</p>
                        <div class="skill-tags"><span>Windows Server</span><span>Active Directory</span><span>DNS</span><span>FTP / IIS</span></div>
                    </article>
                    <article class="skill-card reveal">
                        <div class="skill-icon">02</div><h3>Networking</h3>
                        <p>Supporting network connectivity, segmentation, and infrastructure troubleshooting.</p>
                        <div class="skill-tags"><span>VLANs</span><span>Layer 2 / 3</span><span>FortiGate</span><span>TCP/IP</span></div>
                    </article>
                    <article class="skill-card reveal">
                        <div class="skill-icon">03</div><h3>AWS & Cloud</h3>
                        <p>Building and exploring cloud infrastructure through guided, hands-on projects.</p>
                        <div class="skill-tags"><span>EC2</span><span>VPC</span><span>S3</span><span>IAM</span><span>EKS</span><span>CodeDeploy</span></div>
                    </article>
                    <article class="skill-card reveal">
                        <div class="skill-icon">04</div><h3>DevOps & Containers</h3>
                        <p>Practising automated build, container image, and application deployment workflows.</p>
                        <div class="skill-tags"><span>GitHub Actions</span><span>Docker</span><span>Kubernetes</span><span>Maven</span></div>
                    </article>
                    <article class="skill-card reveal">
                        <div class="skill-icon">05</div><h3>Security & Endpoint</h3>
                        <p>Working with endpoint protection and device management to support safer operations.</p>
                        <div class="skill-tags"><span>Bitdefender</span><span>Hexnode MDM</span><span>Endpoint Security</span></div>
                    </article>
                    <article class="skill-card reveal">
                        <div class="skill-icon">06</div><h3>Automation & Delivery</h3>
                        <p>Improving repeatability through scripts, pipelines, and deployment practices.</p>
                        <div class="skill-tags"><span>CI/CD</span><span>CodeArtifact</span><span>Git</span><span>Linux</span></div>
                    </article>
                </div>
            </div>
        </section>

        <section class="section projects" id="projects">
            <div class="wrap">
                <div class="section-head reveal">
                    <span class="eyebrow">03 / Selected projects</span>
                    <h2>Learning by <span class="gradient-text">building.</span></h2>
                    <p>Hands-on cloud and automation work, alongside practical infrastructure experience. These project summaries describe learning and implementation work rather than claiming production deployments where that has not been established.</p>
                </div>
                <div class="project-grid">
                    <article class="project-card reveal">
                        <div class="project-top"><span class="project-type">Cloud networking</span><span class="project-number">01</span></div>
                        <h3>AWS VPC Peering</h3>
                        <p>Created two Amazon VPCs with public subnets and configured VPC peering to explore private connectivity and routing between separate network environments.</p>
                        <div class="project-stack"><span>AWS VPC</span><span>Route Tables</span><span>Subnets</span></div>
                    </article>
                    <article class="project-card reveal">
                        <div class="project-top"><span class="project-type">Deployment automation</span><span class="project-number">02</span></div>
                        <h3>Application Deployment with CodeDeploy</h3>
                        <p>Worked through an EC2 application deployment using AWS CodeDeploy, deployment groups, application revisions, lifecycle events, and rollback settings.</p>
                        <div class="project-stack"><span>EC2</span><span>CodeDeploy</span><span>AppSpec</span></div>
                    </article>
                    <article class="project-card reveal">
                        <div class="project-top"><span class="project-type">CI/CD pipeline</span><span class="project-number">03</span></div>
                        <h3>GitHub Actions + Docker</h3>
                        <p>Built a Java/Maven workflow using JDK 21, GitHub Actions, Docker image build steps, and an EC2 deployment workflow over SSH.</p>
                        <div class="project-stack"><span>GitHub Actions</span><span>Java</span><span>Docker</span><span>EC2</span></div>
                    </article>
                    <article class="project-card reveal">
                        <div class="project-top"><span class="project-type">Artifact management</span><span class="project-number">04</span></div>
                        <h3>AWS CodeArtifact with Maven</h3>
                        <p>Configured a CodeArtifact repository, IAM access, Maven settings, and authentication to understand secure package storage and dependency management.</p>
                        <div class="project-stack"><span>CodeArtifact</span><span>IAM</span><span>Maven</span></div>
                    </article>
                    <article class="project-card reveal">
                        <div class="project-top"><span class="project-type">Container orchestration</span><span class="project-number">05</span></div>
                        <h3>Amazon EKS Exploration</h3>
                        <p>Practised preparing an EC2 environment, configuring IAM access, and creating an Amazon EKS cluster with eksctl.</p>
                        <div class="project-stack"><span>AWS EKS</span><span>IAM</span><span>eksctl</span><span>Kubernetes</span></div>
                    </article>
                    <article class="project-card reveal">
                        <div class="project-top"><span class="project-type">Infrastructure operations</span><span class="project-number">06</span></div>
                        <h3>Enterprise IT Administration</h3>
                        <p>Practical administration topics including Windows Server, Active Directory, DNS, file services, VLAN-aware networking, endpoint management, and security tooling.</p>
                        <div class="project-stack"><span>Windows Server</span><span>Active Directory</span><span>Networking</span><span>MDM</span></div>
                    </article>
                </div>
            </div>
        </section>

        <section class="section" id="approach">
            <div class="wrap">
                <div class="section-head reveal">
                    <span class="eyebrow">04 / How I work</span>
                    <h2>A straightforward approach to <span class="gradient-text">solving problems.</span></h2>
                </div>
                <div class="approach-grid">
                    <article class="approach-card reveal"><span class="num">01 — UNDERSTAND</span><h3>Find the root cause</h3><p>Gather the right information, review logs and configuration, and understand the impact before making changes.</p></article>
                    <article class="approach-card reveal"><span class="num">02 — IMPLEMENT</span><h3>Make controlled changes</h3><p>Choose a practical solution, follow security and operational best practices, and keep the implementation repeatable.</p></article>
                    <article class="approach-card reveal"><span class="num">03 — VERIFY</span><h3>Test and document</h3><p>Validate the result, monitor for unexpected behaviour, and document what changed so the solution can be maintained.</p></article>
                </div>
            </div>
        </section>

        <section class="section" id="contact">
            <div class="wrap">
                <div class="contact-panel reveal">
                    <div>
                        <span class="eyebrow">05 / Contact</span>
                        <h2>Let's build something<br><span class="gradient-text">reliable together.</span></h2>
                        <p>Have an opportunity, a technical challenge, or an idea to discuss? I'd be glad to connect.</p>
                        <div class="contact-actions">
                            <!-- Replace the example email address with your real email address. -->
                            <a class="btn btn-primary" href="mailto:your.email@example.com">Email me ↗</a>
                            <!-- Replace # with your actual LinkedIn and GitHub profile URLs. -->
                            <a class="btn btn-secondary" href="#" target="_blank" rel="noopener">LinkedIn ↗</a>
                            <a class="btn btn-secondary" href="#" target="_blank" rel="noopener">GitHub ↗</a>
                        </div>
                    </div>
                    <div class="contact-side"><span>BASED IN</span><a href="#home">United Arab Emirates</a><br><br><span>FOCUS</span><a href="#skills">IT · AWS · DEVOPS</a></div>
                </div>
            </div>
        </section>
    </main>

    <footer>
        <div class="wrap footer-inner">
            <span>© <span id="year"></span> Farman Ullah. Built with purpose.</span>
            <a class="back-top" href="#home">BACK TO TOP ↑</a>
        </div>
    </footer>

    <script>
        const menuToggle = document.getElementById("menuToggle");
        const navLinks = document.getElementById("navLinks");

        menuToggle.addEventListener("click", () => {
            const isOpen = navLinks.classList.toggle("open");
            menuToggle.setAttribute("aria-expanded", String(isOpen));
            menuToggle.textContent = isOpen ? "×" : "☰";
        });

        navLinks.querySelectorAll("a").forEach(link => {
            link.addEventListener("click", () => {
                navLinks.classList.remove("open");
                menuToggle.setAttribute("aria-expanded", "false");
                menuToggle.textContent = "☰";
            });
        });

        document.getElementById("year").textContent = new Date().getFullYear();

        const observer = new IntersectionObserver(entries => {
            entries.forEach(entry => {
                if (entry.isIntersecting) {
                    entry.target.classList.add("visible");
                    observer.unobserve(entry.target);
                }
            });
        }, { threshold: 0.12 });

        document.querySelectorAll(".reveal").forEach(element => observer.observe(element));

        const sections = document.querySelectorAll("main section[id]");
        const sectionObserver = new IntersectionObserver(entries => {
            entries.forEach(entry => {
                if (entry.isIntersecting) {
                    document.querySelectorAll(".nav-links a").forEach(link => {
                        link.classList.toggle("active", link.getAttribute("href") === "#" + entry.target.id);
                    });
                }
            });
        }, { rootMargin: "-35% 0px -55% 0px" });

        sections.forEach(section => sectionObserver.observe(section));
    </script>
</body>
</html>
""";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
