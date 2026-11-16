
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
        .hero-grid { display: grid; grid-template-columns: minmax(0, 1.02fr) minmax(0, .98fr); align-items: center; gap: 40px; }
        .availability {
            display: inline-flex; align-items: center; gap: 9px; padding: 8px 13px;
            border: 1px solid var(--line); background: rgba(19, 29, 51, .55);
            border-radius: 999px; color: #c5d2e8; font: .72rem "DM Mono", monospace;
            margin-bottom: 27px;
        }
        .dot { width: 7px; height: 7px; background: #6de6a5; border-radius: 50%; box-shadow: 0 0 14px #6de6a5; }
        .hero h1 { font-size: clamp(3rem, 5.6vw, 5rem); line-height: 1.02; letter-spacing: -.075em; max-width: 760px; }
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

        .visual {
            position: relative; display: grid; align-items: center;
            grid-template-columns: auto minmax(0, 1fr) auto; gap: 14px;
            isolation: isolate;
        }
        .portrait-wrap { position: relative; display: grid; place-items: center; isolation: isolate; }
        .portrait-frame {
            position: relative; width: 100%; aspect-ratio: 1 / 1.12;
            overflow: hidden; border-radius: 28px;
            border: 1px solid rgba(99, 230, 223, .55);
            background: #05070d;
            box-shadow: 0 24px 80px rgba(0, 0, 0, .42), 0 0 55px rgba(99, 230, 223, .12);
        }
        .portrait-frame::before {
            content: ""; position: absolute; inset: 0; z-index: 1; pointer-events: none;
            background: linear-gradient(180deg, transparent 58%, rgba(7, 13, 27, .48));
        }
        .portrait {
            display: block; width: 100%; height: 100%; object-fit: cover;
            object-position: center 35%;
            filter: grayscale(100%) contrast(1.04);
        }
        .portrait-accent {
            position: absolute; z-index: -1; width: 82%; aspect-ratio: 1;
            border: 1px solid rgba(120, 168, 255, .32); border-radius: 50%;
            transform: translate(14%, -12%);
        }
        .tag-col { display: flex; flex-direction: column; justify-content: space-between; align-self: stretch; padding: 8px 0; gap: 16px; }
        .tag-row { grid-column: 1 / -1; display: flex; flex-wrap: wrap; justify-content: center; gap: 10px; }
        .tag-row .float-tag { width: auto; padding: 9px 13px; }
        .float-tag {
            width: 118px; padding: 9px 10px; border: 1px solid var(--line); text-align: center;
            border-radius: 10px; background: rgba(16, 24, 44, .9); color: #cbd7eb;
            font: .68rem "DM Mono", monospace; line-height: 1.4; box-shadow: 0 12px 35px rgba(0,0,0,.2);
        }

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
            .hero-grid { grid-template-columns: 1.15fr .85fr; gap: 25px; }
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
            .visual { display: flex; flex-wrap: wrap; justify-content: center; gap: 10px; margin-top: 10px; }
            .portrait-wrap { order: 1; flex: 0 0 100%; width: min(78vw, 310px); max-width: 310px; margin: 0 auto 8px; }
            .tag-col, .tag-row { display: contents; }
            .float-tag, .tag-row .float-tag { order: 2; width: auto; padding: 8px 11px; }
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

    # <main>
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
                <div class="visual" aria-label="Portrait of Farman Ullah with his skills around it">
                    <div class="tag-row">
                        <div class="float-tag">System Admin</div>
                        <div class="float-tag">Windows Admin</div>
                        <div class="float-tag">Linux Admin</div>
                    </div>
                    <div class="tag-col">
                        <div class="float-tag">Networking</div>
                        <div class="float-tag">FortiGate Firewall</div>
                        <div class="float-tag">Web Dev &amp; Design</div>
                    </div>
                    <div class="portrait-wrap">
                        <div class="portrait-accent" aria-hidden="true"></div>
                        <div class="portrait-frame">
                            <img class="portrait" src="/images/farman-profile.jpeg"
                                 alt="Farman Ullah, Systems Administrator" fetchpriority="high">
                        </div>
                    </div>
                    <div class="tag-col">
                        <div class="float-tag">Office 365 Admin</div>
                        <div class="float-tag">Security</div>
                        <div class="float-tag">IP PABX</div>
                    </div>
                    <div class="tag-row">
                        <div class="float-tag">AWS / Azure / GCP / Oracle</div>
                        <div class="float-tag">CI / CD</div>
                        <div class="float-tag">DevOps</div>
                    </div>
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
                    <p>From everyday system administration to cloud and DevOps engineering, and more.</p>
                </div>
                <div class="skills-grid">
                    <article class="skill-card reveal">
                        <div class="skill-icon">01</div><h3>Systems Administration</h3>
                        <p>Running and supporting servers, user accounts, mailboxes, and day-to-day IT operations.</p>
                        <div class="skill-tags"><span>System Administration</span><span>Windows Administration</span><span>Linux Administration</span><span>Office 365 Administration</span></div>
                    </article>
                    <article class="skill-card reveal">
                        <div class="skill-icon">02</div><h3>Networking & Telephony</h3>
                        <p>Keeping networks, firewalls, and business phone systems connected and protected.</p>
                        <div class="skill-tags"><span>Networking</span><span>FortiGate Firewall Administration</span><span>IP PABX</span></div>
                    </article>
                    <article class="skill-card reveal">
                        <div class="skill-icon">03</div><h3>Cloud Platforms</h3>
                        <p>Working across public clouds, from virtual machines to networking and access control.</p>
                        <div class="skill-tags"><span>AWS</span><span>Azure</span><span>GCP</span><span>Oracle Cloud</span></div>
                    </article>
                    <article class="skill-card reveal">
                        <div class="skill-icon">04</div><h3>DevOps & CI/CD</h3>
                        <p>Automating builds and deployments so releases are repeatable.</p>
                        <div class="skill-tags"><span>CI/CD</span><span>DevOps</span><span>GitHub Actions</span><span>Docker</span><span>Maven</span></div>
                    </article>
                    <article class="skill-card reveal">
                        <div class="skill-icon">05</div><h3>Security</h3>
                        <p>Protecting systems through firewalls, endpoint tools, and access control.</p>
                        <div class="skill-tags"><span>Security</span><span>FortiGate</span><span>Endpoint Security</span></div>
                    </article>
                    <article class="skill-card reveal">
                        <div class="skill-icon">06</div><h3>Web Development & Design</h3>
                        <p>Building and designing responsive websites, like this one.</p>
                        <div class="skill-tags"><span>Web Development</span><span>Web Design</span><span>HTML / CSS</span></div>
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